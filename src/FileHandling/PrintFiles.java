package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\91900\\Downloads";
		File file = new File(path);
		
		File downloadDir[] = file.listFiles();
		Arrays.sort(downloadDir);
		
		for(File e:downloadDir) {
			if(e.isFile()) {
				System.out.println("File:"+e.getName()+e.getAbsolutePath());
			}else if(e.isDirectory()){
				System.out.println("Directory:"+e.getName()+e.getAbsolutePath());
			}else {
				System.out.println("Not Known:"+e.getName()+e.getAbsolutePath());
			}
		}
	}

}
