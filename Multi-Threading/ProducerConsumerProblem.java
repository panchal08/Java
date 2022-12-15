class Company {
	int n;
	boolean flag = false;
	public synchronized void produce_item(int n) {
		if(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.n = n;
		System.out.println("Produced : "+this.n);
		flag = true;
		notify();
	}
	public synchronized int consume_item() {
		if(!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Consumed : "+this.n);
		flag = false;
		notify();
		return this.n;
	}
}
class Producer extends Thread {
	Company c;
	Producer(Company c) {
		this.c = c;
	}
	public void run() {
		int i = 1;
		while(true) {
			this.c.produce_item(i);
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
class Consumer extends Thread {
	Company c;
	Consumer(Company c) {
		this.c = c;
	}
	public void run() {
		while(true) {
			this.c.consume_item();
			try{
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerProblem {
	public static void main(String [] args) {
		Company comp = new Company();
		Producer p = new Producer(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();
	}
}