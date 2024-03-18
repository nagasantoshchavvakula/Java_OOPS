package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// #1:Assigning Path to String Data type
		String path = "C:\\Users\\91900\\Downloads\\FileHandling\\sample.txt";
		File file = new File(path);
		
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("File is Created...");
			}else {
				System.out.println("File is already present...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//#2 File Output stream along with Scanner
	
		try {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the file name with path:");
				String fileName = sc.nextLine();
				FileOutputStream fos = new FileOutputStream(fileName,true);
				System.out.println("Enter the Content:");
				String Content = sc.nextLine();
				byte b[] = Content.getBytes();
				try {
					fos.write(b);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File is created successfully...");
		
		//#3 Java NIO package
		
		try {
			Path pathLocation = Paths.get("C:\\Users\\91900\\Downloads\\FileHandling\\chandu.txt");
			Path newPath = Files.createFile(pathLocation);
			System.out.println("New file Created at:"+newPath);
		}catch(Exception e) {
			System.out.println("Some exception is Coming...");
			e.printStackTrace();
		}
		
	}

}
