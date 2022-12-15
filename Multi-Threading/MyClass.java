class MyThread extends Thread {
	Thread t = new Thread();
	public void run() {
		for(int i = 1; i < 10; i++) {		
			try {t.join();} catch(Exception e) {}
			System.out.println("MyThread");
		}
	} 
}
public class MyClass {
	public static void main(String[] args) throws Exception{
		MyThread mt = new MyThread();
		mt.start();
		for(int i = 1; i < 10;i++) {
			//Thread.sleep(1000);
			
			System.out.println("Main");
		}
	}
}