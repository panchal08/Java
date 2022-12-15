import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
public class TestSpliting {
	private static int ss = 0;
	public static boolean split(String copyFrom, String paste) throws Exception {
		try{
			long startTime = System.currentTimeMillis();
			File file = new File(copyFrom);
			long next = 0l;
			long size = file.length();
			long MB = size / 4;
			int decode = 0;
			byte[] bytes = new byte[1];
			FileInputStream input = new FileInputStream(copyFrom);
			for(int count = 1; count <= 4; count++,next = 0l) {
				FileOutputStream output = new FileOutputStream(paste+"Part"+count+".jpg");
				while((decode = input.read(bytes)) != -1 && (next += 1)<= MB)
					output.write(bytes, 0, decode);
				output.close();
			}
			input.close();
			ss  = (int)(System.currentTimeMillis() - startTime) / 1000;
			return true;
		} catch(java.io.FileNotFoundException fnfe) {
			return false;
		}
	}
	public static void main(String[] args) throws Exception {
		boolean flag = split("E:/Download/1-wtc-america-architecture-374710.jpg","D:/Split File/");
		String line = "__________________";
		if(flag)
			System.out.println("\t "+line+line+"\n\t|   ~ File Spliting successfully ~   |\n\t|   Spliting Time in Seconds   : "+ss+"  |\n\t|"+line+line+"|");
		else
			System.out.println("\t "+line+line+"\n\t|\t ~ Please try again ~        |\n\t|"+line+line+"|");
	}
}