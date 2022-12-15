import java.util.*;
public class StringShordting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int k=s.nextInt();
		String strStore = "";
		char arr[] = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				char tmp = 0;
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		} 
		strStore = String.valueOf(arr);
		System.out.println(strStore);baccc   ccbca
									
	}									

}