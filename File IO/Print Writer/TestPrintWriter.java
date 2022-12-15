import java.io.*;
public class TestPrintWriter {
	public static void check() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("D:/xyz.txt"));
		out.write(100);
		out.println(100);
		out.println("Sterling");
		out.println("Institute");
		out.println(10.0);
		out.println('I');
		out.flush();
		out.close();
		System.out.println("success");
	}
	public static void main(String[] args) throws Exception {
		check();
	}
}