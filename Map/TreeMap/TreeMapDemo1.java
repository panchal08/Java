import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
}
public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap m = new TreeMap(new MyComparator());
		m.put("Anas",105);
		m.put("Namir",109);
		m.put("Shivani",101);
		m.put("Iliyas",106);
		m.put("Rashid",102);
		System.out.println(m);
	}
}