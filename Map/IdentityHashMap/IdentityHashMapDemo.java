import java.util.*;
public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap m = new IdentityHashMap();
		Integer I1 = new Integer(101);
		Integer I2 = new Integer(101);
		Integer I3 = new Integer(100);
		m.put(I1,"Hello");
		m.put(I2,"Hii");
		m.put(I3,"Hii");
		System.out.println(m);
	}
}