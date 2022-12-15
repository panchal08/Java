import java.io.*;
class Dog implements Serializable {
	String firstName = "Shubham";
	String lastName = "Panchal";
}
public class SerializeDemo {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		
		FileOutputStream fos = new FileOutputStream("D:/obj.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("D:/obj.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println(d2.firstName+" "+d2.lastName);
	}
}