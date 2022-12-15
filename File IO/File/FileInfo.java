import java.io.File;
public class FileInfo {
	private static int countDrives = 0;
	private static int countCDDrives = 0;
	private static long countFolders = 0l;
	private static long countFiles = 0l;
	public static void search() {
		File[] drives = File.listRoots();
		for(File file : drives) {
			if(file.isDirectory()) {
				countDrives++;
				File[] fileName = file.listFiles();
				for(File f1 : fileName) {
					if(f1.isHidden()) {
						countFolders++;
					} else {
						if(f1.isDirectory()) {
							count(f1);
							countFolders++;
						} else {
							countFiles++;
						}
					}
				}
			} else {
				countCDDrives++;
			}
		}
	}	
	public static void count(File f2) {
		File[] fileName = f2.listFiles();
		for(File f3 : fileName) {
			if(f3.isHidden()) {
				countFolders++;
			} else {
				if(f3.isDirectory()) {
					count(f3);
					countFolders++;
				} else {
					countFiles++;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		search();
		String line = "_____________";
		System.out.println("    "+line+line+line+line+line+"___");
		System.out.println("   |\t\t\tSystem Information\t\t\t\t|");
		System.out.println("   |\t\t\t------------------\t\t\t\t|");
		System.out.println("   |\tNumber of Drives available in this System	: "+countDrives+" drives\t|");
		System.out.println("   |\tNumber of CDDrives available in this System	: "+countCDDrives+" cd-drives\t|");
		System.out.println("   |\tNumber of Folders available in this System	: "+countFolders+" folders\t|");
		System.out.println("   |\tNumber of Files available in this System	: "+countFiles+" files\t|");
		System.out.println("   |"+line+line+line+line+line+"___|");
	}
}