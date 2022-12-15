import java.io.*;
class Account implements Serializable {
	String username = "mr_panchal.08";
	transient String password = "abc.123";
	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String pwd = "123"+password;
		os.writeObject(pwd);
	}
	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String pwd = (String)is.readObject();
		password = pwd.substring(3);
	}
}
public class CustSerializedemo {
	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println("Username :"+a1.username+"\nPassword :"+a1.password);
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("D:/xyz.ser"));
		output.writeObject(a1);
		output.close();
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:/xyz.ser"));
		Account a2 = (Account)input.readObject();
		System.out.println("Username :"+a2.username+"\nPassword :"+a2.password);
		input.close();
	}
}