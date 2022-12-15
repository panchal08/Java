class MyThreadITC extends Thread {
	int total;
	public void run() {
		synchronized(this){
			System.out.println("Counting Start");
			for(int i = 1; i <= 100; i++) 
				total = total + i;
			System.out.println("Done");
			//this.notify();
		}
	}
}
public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		MyThreadITC mt = new MyThreadITC();
		mt.start();
		mt.sleep(10000);
		synchronized(mt) {
			this.notify();
			System.out.println("waiting");
			mt.wait();
			System.out.println("Time Over");
			System.out.println(mt.total); 
		}
	}
}