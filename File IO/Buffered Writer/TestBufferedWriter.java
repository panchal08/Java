import java.io.FileWriter;
import java.io.BufferedWriter;
public class TestBufferedWriter {
	public static void bufferedWriter() throws Exception {
		FileWriter file = new FileWriter("D:/xyz.txt", true);
		BufferedWriter out = new BufferedWriter(file);
		out.newLine();
		out.write("Hello, i am Shubham Panchal", 6, 20);
		out.close();
	}
	public static void main(String[] args) throws Exception {
		bufferedWriter();
	}
}