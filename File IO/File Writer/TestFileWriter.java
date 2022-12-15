import java.io.FileWriter;
public class TestFileWriter {
	public static void fileWriter() throws Exception {
		FileWriter out = new FileWriter("D:/xyz.txt",true);
		out.write("Panchal");
		out.write(49);
		out.flush();
		out.close();
		System.out.println("Task Complite");
	}
	public static void main(String[] args) throws Exception {
		fileWriter();
	}
}