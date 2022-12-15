import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
public class Board extends JPanel implements ActionListener {
	private final static int BOARDWIDTH = 500;
	private final static int BOARDHEIGHT = 500;
	private final static int PIXELSIZE = 10;
	private static int apple;
	private final static int TOTALPIXELS = (BOARDWIDTH * BOARDHEIGHT)/(PIXELSIZE * PIXELSIZE);
	private boolean inGame = true;
	private Timer timer;
	private static int speed = 100;
	private Snake snake = new Snake();
	private Food food = new Food();
	public Board() {
		addKeyListener(new Keys());
		setBackground(Color.decode("#000"));
		setFocusable(true);
		setPreferredSize(new Dimension(BOARDWIDTH, BOARDHEIGHT));
		initializeGame();
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
		if (inGame == true) {
			g.setColor(Color.RED);
			g.fillRect(food.getFoodX(), food.getFoodY(), PIXELSIZE, PIXELSIZE);
			for (int i = 0; i < snake.getJoints(); i++) {
				if (i == 0) {
					g.setColor(Color.decode("#00FF00"));
					g.fillRect(snake.getSnakeX(i), snake.getSnakeY(i),PIXELSIZE, PIXELSIZE);
				} else {
					g.fillRect(snake.getSnakeX(i), snake.getSnakeY(i),PIXELSIZE, PIXELSIZE);
				}
			}
			Toolkit.getDefaultToolkit().sync();
		} else {
			endGame(g);
		}
	}
	public void initializeGame() {
		System.out.println("\n	 ~ GAME START ~\n");
		snake.setJoints(4);
		for (int i = 0; i < snake.getJoints(); i++) {
			snake.setSnakeX(BOARDWIDTH / 2);
			snake.setSnakeY(BOARDHEIGHT / 2);
		}
		snake.setMovingRight(true);
		food.createFood();
		timer = new Timer(speed, this);
		timer.start();
	}
	public void checkFoodCollisions() {
		if ((proximity(snake.getSnakeX(0), food.getFoodX(), 0)) && (proximity(snake.getSnakeY(0), food.getFoodY(), 0))) {
			apple++;
			snake.setJoints(snake.getJoints() + 1);
			food.createFood();
		}
	}
	public void checkCollisions() {
		for (int i = snake.getJoints(); i > 0; i--) {
			if ((i > 5) && (snake.getSnakeX(0) == snake.getSnakeX(i) && (snake.getSnakeY(0) == snake.getSnakeY(i))))
				inGame = false;
		}
		if (snake.getSnakeY(0) >= BOARDHEIGHT) inGame = false;
		if (snake.getSnakeY(0) < 0) inGame = false;
		if (snake.getSnakeX(0) >= BOARDWIDTH) inGame = false;
		if (snake.getSnakeX(0) < 0) inGame = false;
		if (!inGame) timer.stop();
	}
	public void endGame(Graphics g) {
		String message = "Game over";
		String eat = "Apple     :  "+apple+".";
		String recard = "Score     :  "+apple*83+".";
		String conti = "Press enter key for continue game.";
		String exit = "Press  X  key for exit Game.";
		Font font = new Font("Showcard Gothic", Font.PLAIN, 50);
		g.setColor(Color.decode("#FFFF00"));
		g.setFont(font);
		g.drawString(message,120 , 180);
		Font font1 = new Font("Arial", Font.PLAIN, 25);
		g.setColor(Color.green);
		g.setFont(font1);
		g.drawString(eat,190 , 230);
		Font font2 = new Font("Arial", Font.PLAIN, 25);
		g.setColor(Color.green);
		g.setFont(font2);
		g.drawString(recard,190 , 260);
		Font font3 = new Font("Arial", Font.PLAIN, 17);
		g.setColor(Color.RED);
		g.setFont(font3);
		g.drawString(conti,100 , 350);
		Font font4 = new Font("Arial", Font.PLAIN, 17);
		g.setColor(Color.RED);
		g.setFont(font4);
		g.drawString(exit,100 , 370);
		System.out.println("	 ~ GAME OVER ~\n	"+eat+"\n	"+recard);
	}
	public void actionPerformed(ActionEvent e) {
		if (inGame == true) {
			checkFoodCollisions();
			checkCollisions();
			snake.move();
		}
		repaint();
	}
	private class Keys extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			if ((key == KeyEvent.VK_LEFT) && (!snake.isMovingRight())) {
				snake.setMovingLeft(true);
				snake.setMovingUp(false);
				snake.setMovingDown(false);
			}
			if ((key == KeyEvent.VK_RIGHT) && (!snake.isMovingLeft())) {
				snake.setMovingRight(true);
				snake.setMovingUp(false);
				snake.setMovingDown(false);
			}
			if ((key == KeyEvent.VK_UP) && (!snake.isMovingDown())) {
				snake.setMovingUp(true);
				snake.setMovingRight(false);
				snake.setMovingLeft(false);
			}
			if ((key == KeyEvent.VK_DOWN) && (!snake.isMovingUp())) {
				snake.setMovingDown(true);
				snake.setMovingRight(false);
				snake.setMovingLeft(false);
			}
			if ((key == KeyEvent.VK_ENTER) && (inGame == false)) {
				inGame = true;
				snake.setMovingDown(false);
				snake.setMovingRight(false);
				snake.setMovingLeft(false);
				snake.setMovingUp(false);
				initializeGame();
			}
		}
	}
	private boolean proximity(int a, int b, int closeness) {
		return Math.abs((long) a - b) <= closeness;
	}
	public static int getAllDots() {
		return TOTALPIXELS;
	}
	public static int getDotSize() {
		return PIXELSIZE;
	}
}