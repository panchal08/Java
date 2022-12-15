import java.util.Scanner;
public class Fibonacci {
	/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();*/
		long startEle=20;
		long endEle=100;
			for(int i = 1, firstElement = 0, secondElement = 0, sum = 1; i <= endEle; i++) {
			firstElement = secondElement;
			secondElement = sum;
			sum = firstElement + secondElement;
			if(firstElement>startEle && firstElement<endEle)
			System.out.print(firstElement+" ");
		}
	}
	}
}