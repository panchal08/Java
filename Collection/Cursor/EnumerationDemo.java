import java.util.*;
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector vector = new Vector();
		for(int i = 0; i < 10; i++)
			vector.add(i);
		System.out.println(vector);
		Enumeration enu = vector.elements();
		while(enu.hasMoreElements()) {
			Integer I = (Integer)enu.nextElement();
			if(I % 2 == 0)
				System.out.println(I);
		}
	}
}