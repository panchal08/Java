import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(2011,"Sheetal");
		m.put(2013,"Sonali");
		m.put(2014,"Shivani");
		m.put(2015,"Kamini");
		m.put(2016,"Aprna");
		m.put(2018,"Riya");
		m.put(2020,null);
		System.out.println(m);
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
	}
}