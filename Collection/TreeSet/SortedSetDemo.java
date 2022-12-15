import java.util.*;
public class SortedSetDemo {
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
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet(106));
		System.out.println(t.tailSet(105));
		System.out.println(t.subSet(101,115));
	}
}