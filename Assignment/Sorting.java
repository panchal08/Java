import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter word 	:");
		String str1 = s.next();
		System.out.print("Enter word	:");
		String str2 = s.next();
		String strStore1 = "";
		String strStore2 = "";
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i+1; j < arr1.length; j++) {
				//char tmp = 0;
				if(arr1[i] > arr1[j]) {
					char tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			}
			strStore1 = strStore1 + arr1[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			for(int j = i+1; j < arr2.length; j++) {
				char tmp = 0;
				if(arr2[i] > arr2[j]) {
					tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
			strStore2 = strStore2 + arr1[i];
		}
		if(strStore1.equals(strStore2)) 
			System.out.println("Anagram");
		else
			System.out.println("Not a Anagram");
		System.out.println(valueOf(arr1[]));
	}
}