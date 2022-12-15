import java.io.File;
public class FileHandling {
	public static void operation() throws Exception {
		File file = new File("D:/xyz.txt");
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		System.out.println(file.getParentFile());
		System.out.println(file.isAbsolute());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.lastModified());
		System.out.println(file.length());
		System.out.println(file.createNewFile());
		System.out.println(file.mkdir());
		System.out.println(file.mkdirs());
		System.out.println(file.renameTo(file));
		System.out.println(file.setLastModified(100000000000000000l));
		System.out.println(file.setReadOnly());
		System.out.println(file.setWritable(true));
		System.out.println(file.getTotalSpace());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getUsableSpace());
		System.out.println(file.delete());
	}
	public static void main(String[] args) throws Exception {
		operation();
	}
}