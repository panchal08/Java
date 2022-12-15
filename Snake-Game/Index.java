import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class Index extends JFrame {
	private final static int BOARDWIDTH = 500;
	private final static int BOARDHEIGHT = 500;
	public Index(){
		setBackground(Color.BLACK);
		setFocusable(true);
		setPreferredSize(new Dimension(BOARDWIDTH, BOARDHEIGHT));
		setResizable(false);
		pack();
		setTitle("Snake Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startGame();
		setVisible(true);
	}
	public void startGame() {
		JLabel background;
		ImageIcon img = new ImageIcon("E:/Download/SnakeRivals.jpg");
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,0,0);
		add(background);
	}
}