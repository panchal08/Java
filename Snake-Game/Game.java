import java.awt.EventQueue;
import javax.swing.JFrame;
public class Game extends JFrame {
	public Game() {
		add(new Board());
		setResizable(false);
		pack();
		setTitle("Snake Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Index index = new Index();
		System.out.println("\n	LOADING...");
		try{Thread.sleep(5000);}catch(Exception e){}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new Game();
				frame.setVisible(true);
			}
		});
	}
}