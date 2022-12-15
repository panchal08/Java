import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object o1,Object o2){
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
}
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue(11,new MyComparator());
		q.offer("F");
		q.offer("Z");
		q.offer("A");
		q.offer("L");
		System.out.println(q);//[Z,L,A,F]
	}
}