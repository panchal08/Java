import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString(); 
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}
}
public class Employee {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(new StringBuffer("Shubham"));
		t.add(new StringBuffer("Namir"));
		t.add(new StringBuffer("Anas"));
		t.add(new StringBuffer("Shivani"));
		t.add(new StringBuffer("Iliyas"));
		System.out.println(t);
	}
}