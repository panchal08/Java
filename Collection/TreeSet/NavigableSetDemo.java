import java.util.*;
public class NavigableSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(115);
		t.add(106);
		t.add(100);
		t.add(104);
		t.add(120);
		t.add(110);
		t.add(101);
		System.out.println(t);
		System.out.println(t.lower(104));
		System.out.println(t.floor(102));
		System.out.println(t.ceiling(110));
		System.out.println(t.higher(110));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
		System.out.println(t);
	}
}