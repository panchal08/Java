public class ThreadDemorun implements Runnable {
	private String wish;
	
	public ThreadDemorun(String wish) {
		this.wish = wish;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++)
			System.out.println(wish);
	}
	
	public static void main(String[] args) {
		ThreadDemorun td1 = new ThreadDemorun("Hello Sir");
		ThreadDemorun td2 = new ThreadDemorun("Hello Guys");
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);
		t1.start();
		t2.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Good Evening Class");
		}
	}
}