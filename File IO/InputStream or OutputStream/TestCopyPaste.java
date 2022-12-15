import java.io.FileInputStream;
import java.io.FileOutputStream;
class CopyPaste {
	public static boolean copyPaste(String copyFrom, String paste) throws Exception {
		try{	
			FileInputStream input = new FileInputStream(copyFrom);
			FileOutputStream output = new FileOutputStream(paste);
			int decode;
			while((decode = input.read()) != -1)
				output.write(decode);
			input.close();
			output.close();	
			return true;
		} catch(java.io.FileNotFoundException fnfe) {
			return false;
		}
	}
}	
public class TestCopyPaste {
	public static void main(String[] args) throws Exception {
		CopyPaste cp = new CopyPaste();
		boolean flag = cp.copyPaste("E:/Videos/Artist song.mp4","D:/Song.mp4");
		if(flag) {
			System.out.println("File copy successfully");
		} else {
			System.out.println("Please try again");
		}
	}
}