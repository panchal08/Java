import java.util.Vector;
public class TestVector {
	public static void vectorMethod() {
		Vector v = new Vector();
			v.add(10);
			v.add("abc");
			v.add(10.5);
			v.add('a');
			v.add(true);
			v.add(null);
			v.add(10);
			System.out.println("Vector  : "+v);
			System.out.println("Size of Vector : "+v.size());
			System.out.println("Capacity of Vector : "+v.capacity());
			System.out.println("Last index element : "+v.lastIndexOf(10,5));
			System.out.println("Fatch Index : "+v.elementAt(5));
			v.addElement(5.4f);
			System.out.println("Vector : "+v);
			System.out.println("First element : "+v.firstElement());
			System.out.println("Last element : "+v.lastElement());
			v.setElementAt(10000000l,5);
			System.out.println("Vector : "+v);
			v.removeElementAt(4);
			System.out.println("Vector : "+v);
			System.out.println("String : "+v.toString());
			System.out.println("Enumeration : "+v.elements());
			v.insertElementAt("xyz",2);
			System.out.println("Vector : "+v);
			System.out.println("Remove Element : "+v.removeElement(10000000l));
			System.out.println("Vector : "+v);
			v.removeAllElements();
			System.out.println("Vector : "+v);
	}
	public static void main(String[] args) {
		vectorMethod();
	}
}