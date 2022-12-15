import java.io.*;
public class ExecutionTimeOfReaders {
	private static int ssFile = 0;
	private static int ssBuffered = 0;
	public static void fileReader() throws Exception {
		long startTime = System.currentTimeMillis();
		FileReader fr = new FileReader("D:/abc.txt");
		int ch;
		while((ch = fr.read())!= -1)
			System.out.print((char)ch);
		fr.close();
		ssFile  = (int)(System.currentTimeMillis() - startTime) / 1000;
	}
	public static void bufferedReader() throws Exception {
		long startTime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new FileReader("D:/abc.txt"));
		String line;
		while((line = br.readLine()) != null)
			System.out.print(line);
		br.close();
		ssBuffered  = (int)(System.currentTimeMillis() - startTime) / 1000;
	}
	public static void main(String[] args) throws Exception {
		fileReader();
		bufferedReader();
		String line = "__________________________";
		System.out.println("\n    "+line+line);
		System.out.println("   |\tExecution Time of FileReader\t\t: "+ssFile+"\t|\n   |\t----------------------------\t\t\t|");
		System.out.println("   |\tExecution Time of BufferedReader\t: "+ssBuffered+"\t|\n   |\t--------------------------------\t\t|");
		System.out.println("   |"+line+line+"|");
	}
}