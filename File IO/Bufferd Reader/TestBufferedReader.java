import java.io.FileReader;
import java.io.BufferedReader;
public class TestBufferedReader {
	public static void bufferedReader() throws Exception {
		FileReader fr = new FileReader("D:/lmn.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null) {
			System.out.print(line);
			line = br.readLine();
		}
		fr.close();
		br.close();
	}
	public static void main(String[] args) throws Exception {
		bufferedReader();
	}
}