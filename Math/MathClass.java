public class MathClass {
	public static void convert(long ms) {
		double ss = Math.floor(ms / 1000);
		System.out.println("ss"+ss);
		double mm = Math.floor(ss / 60);
		System.out.println("mm"+mm);
		ss = ss % 60;
		System.out.println("ss"+ss);
		double HH = Math.floor(mm / 60);
		System.out.println("HH"+HH);
		mm = mm % 60;
		System.out.println("mm"+mm);
		double dd = Math.floor(HH / 24);
		System.out.println("dd"+dd);
		HH = HH % 24;
		System.out.println("HH"+HH);
		HH = HH + (dd * 24);
		System.out.println("HH"+HH);
	}
	public static void main(String[] args) {
		convert(174044);
	}
} 
 