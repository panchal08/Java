import java.util.ArrayList;
public class TestArrayListMethod {
	public static void listMethod() {
		ArrayList al = new ArrayList();
			al.add(10);
			al.add('a');
			al.add("abc");
			al.add(10.5);
			al.add(null);
			al.add("xyz");
			al.add(10);
			System.out.println(al);
			System.out.println(al.get(5));
			al.set(4,'D');
			System.out.println(al);
			al.add(5,"lmn");
			System.out.println(al);
			al.remove(7);
			System.out.println(al);
			System.out.println(al.indexOf(10));
			System.out.println(al.lastIndexOf("xyz"));
			System.out.println(al.subList(2,5));		
	}
	public static void main(String[] args) {
		listMethod();
	}
}