public class PerfactNumber {
	public static void main(String[] args) {
		for(int num = 2, res = 0; num <= 100; res = 0, num++) {
			for(int perfact = 1; perfact < num; perfact++)
				if(num % perfact == 0) res = res + perfact;
			if(num == res) System.out.println(num);
}	}	}