import java.util.*;
class Student implements Comparable {
	private String ID;
	private String name;
	private int maths;
	private int physics;
	public Student() {
	}
	public Student(String ID, String name, int maths, int physics) {
		this.ID = ID;
		this.name = name;
		this.maths = maths;
		this.physics = physics;
	}
	public String toString() {
		return "\n"+ID+"	"+name+"	  "+maths+"	"+physics+"	";
	} 
	public int compareTo(Object o) {
		Student S = (Student)o;
		return this.ID.compareTo(S.ID);
	}
}
public class StudentCollection {
	public static void main(String[] args) {
		Student S1 = new Student("105", "Shubham", 60, 65);
		Student S2 = new Student("102", "Namir", 76, 84);
		Student S3 = new Student("104", "Anas", 72, 77);
		Student S4 = new Student("101", "Shivani", 81, 72);
		Student S5 = new Student("103", "Iliyas", 78, 81);
		TreeSet t = new TreeSet();
		t.add(S1);
		t.add(S2);
		t.add(S3);
		t.add(S4);
		t.add(S5);
		System.out.println("ID	Name	  Maths	Physics"+t);
	}
}