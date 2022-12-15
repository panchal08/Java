public class PrimeSeries {
	public static int[] prime(int a, int b) {
		int arr[] = new int[b];
		int n = 0;
		for(int i = 25; i <= 60; i++) {
			int count = 0;
			for(int j = 2; j <= i; j++)
				if(i % j == 0)
					count++;
			if(count == 1){	
				arr[n] = i;
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {

		int arr[] = prime(25,60);
		for(int n:arr)
		System.out.print(n);
	}
}