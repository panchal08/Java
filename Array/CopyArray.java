public class CopyArray {
	public static void main(String[] args) {
		char[] copyFrom = {'a','b','c','d','e','f','g'};
		char[] copyTo = {'l','m','n','x','y','z'};
		System.arraycopy(copyFrom, 1, copyTo, 2, 3);
		System.out.println(copyTo);		
	}
}