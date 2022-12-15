import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
public class WordCounter {
	private String insert = "";
	private long word = 0l;
	
	public void count() throws Exception {
		ArrayList al = new ArrayList();
		FileReader fr = new FileReader("D:/lmn.txt");
		int ch = fr.read();
		while(ch != -1) {
			if(ch != 32 && ch != 13) {
				char ch1 = (char)ch;
				insert = insert + ch1;
			} else {
				al.add(insert);
				insert = "";
			}
			ch = fr.read();
		}
		fr.close();
		word = al.size();
		System.out.println(al);
	}
	public long getWord() {
		return word;
	}
	public static void main(String[] args)throws Exception {
		WordCounter wc = new WordCounter();
		wc.count();
		String line = "_____________";
		System.out.println("    "+line+line+line+line+"");
		System.out.println("   |\t\t\tWord Counter\t\t\t|");
		System.out.println("   |\t\t\t------------\t\t\t|");
		System.out.println("   |\tTotal Words\t\t	: "+wc.getWord()+"\t\t|");
		System.out.println("   |"+line+line+line+line+"|");
	}
}	