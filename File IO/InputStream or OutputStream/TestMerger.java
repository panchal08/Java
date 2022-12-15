import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
public class TestMerger {
	static int ss = 0;
	public static boolean merg(String copyFrom, String paste) throws Exception {
		try {
			int decode = 0;
			long startTime = System.currentTimeMillis();
			FileOutputStream output = new FileOutputStream(paste);
			File file = new File(copyFrom);
			byte[] bytes = new byte[1];
			File[] fileName = file.listFiles();
				for(File f1 : fileName) {
					FileInputStream input = new FileInputStream(f1);
					while((decode = input.read(bytes)) != -1)
						output.write(bytes, 0, decode);
					input.close();
				}
			output.close();
			ss  = (int)(System.currentTimeMillis() - startTime) / 1000;
			return true;
		} catch(java.io.FileNotFoundException fnfe) {
			return false;
		}
	}
	public static void main(String[] args)throws Exception {
		boolean flag = merg("D:/Split File/","D:/Merg File/Architecture.jpg");
		String line = "__________________";
		if(flag)
			System.out.println("\t "+line+line+"\n\t|   ~ File Merging successfully ~    |\n\t|   Merging Time in Seconds   : "+ss+"   |\n\t|"+line+line+"|");
		else
			System.out.println("\t "+line+line+"\n\t|\t ~ Please try again ~        |\n\t|"+line+line+"|");
	}
}