public class TestMultiThreading implements Runnable {
	private String name;
	public TestMultiThreading(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) throws Exception {
		TestMultiThreading m1 = new TestMultiThreading("Shubham");
		TestMultiThreading m2 = new TestMultiThreading("Panchal");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		t1.sleep(10000);
		System.out.println(t1.getName());
		System.out.println("id : "+t1.getId());
		System.out.println(t1.currentThread());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
	}
}