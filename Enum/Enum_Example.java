enum Developer {
	Shubham, Iliyas, Anas;
}
public class Enum_Example {
	public static void main(String[] args) {
		Developer d = Developer.Shubham;
		System.out.println(d);
		for(Developer d1:Developer.values()) 
			System.out.println(d1);
	}
}
