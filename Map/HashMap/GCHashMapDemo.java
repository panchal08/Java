import java.util.*;
class Temp {
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("This is Finalize()");
	}
}
public class GCHashMapDemo {
	public static void main(String[] args) throws Exception {
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t,"Riya");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}