import java.io.FileReader;
public class TestFileReader {
	public static void fileReader() throws Exception {
		FileReader fr = new FileReader("D:/lmn.txt");
		int ch = fr.read();
		while(ch != -1) {
			char chr = (char)ch;
			System.out.print(chr);
			ch = fr.read();
		}
	}
	public static void main(String[] args) throws Exception {
		fileReader();
	}
}