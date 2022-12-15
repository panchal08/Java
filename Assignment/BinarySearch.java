public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int LB = 0;
		int UB = arr.length - 1;
		int mid = ((LB + UB) / 2);
		int item = 5;
		while((arr[mid] != item) && (LB <= UB)) {
			if(item > arr[mid]) LB = mid + 1;
			else UB = mid - 1;
			mid = ((LB + UB) / 2);
		}
		System.out.println((arr[mid] == item) ? "\n\tElement founded in index : "+mid : "\n\tElement not founded");
	}
}