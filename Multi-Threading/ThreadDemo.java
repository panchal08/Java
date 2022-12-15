public class ThreadDemo extends Thread{
	private String wish;
	
	public ThreadDemo(String wish) {
		this.wish = wish;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++)
			System.out.println(wish);
	}
	
	public static void main(String[] args) {
		ThreadDemo td1 = new ThreadDemo("Hello Sir");
		ThreadDemo td2 = new ThreadDemo("Hello Guys");
		td1.start();
		td2.start();
		for(int i = 0; i < 10; i++)
			System.out.println("Good Evening Class");
	}
}