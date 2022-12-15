import java.util.ArrayList;
public class TestArrayList {
	public static void collectionMethod() {
		
		ArrayList al = new ArrayList();
			al.add(10);
			al.add('a');
			al.add("abc");
			al.add(null);
			al.add(10.5);
			al.add(true);
			al.add("xyz");
			al.add('a');
			al.add(7.2f);
			al.add(100000000000l);
			System.out.println(al);
			System.out.println("Default Size of ArrayList : "+al.size());
			al.add(15);
			al.add(25);
			al.add(20);
			System.out.println("new Capacity : "+al.size());
			System.out.println("Check ArrayList is Empty : "+al.isEmpty());
			System.out.println("Check Element : "+al.contains(10));
			al.remove("xyz");
			System.out.println(al);
			System.out.println(al.hashCode());
			
		ArrayList al1 = new ArrayList();
			al1.add(10);
			al1.add('a');
			al1.add("abc");
			al1.add(null);
			al1.add(10.5);
			System.out.println(al1);
			System.out.println(al1.hashCode());
			
		ArrayList al2 = new ArrayList();
			al2.add(10);
			al2.add('a');
			al2.add("abc");
			al2.add(null);
			al2.add(10.5);
			System.out.println(al2);
			System.out.println(al2.equals(al1));
			System.out.println(al.containsAll(al2));
			
		ArrayList al3 = new ArrayList();
			al3.addAll(al);
			al3.addAll(al1);
			al3.addAll(al2);
			System.out.println(al3);
			System.out.println(al3.containsAll(al2));
			System.out.println(al3.retainAll(al2));
			System.out.println(al3);
			al.clear();
			System.out.println(al);
	}
	public static void main(String[] args) {
		collectionMethod();
	}
}