class Student {
	public Student() {
		System.out.println("Hello from Student class");
	}
}
class Customar {
	public Customar() {
		System.out.println("Hello from Customar class");
	}
}
public class Test {
	public static void main(String[] args) throws Exception {
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("Object created : "+o.getClass().getName());
	}
}