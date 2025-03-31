package ch01;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) throws IOException {
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) tempDir.mkdir();
		
		File newFile = new File("c:/temp/newFile.txt");
		if(!newFile.exists()) newFile.createNewFile();
		
		//#2 파일구분자
		File newFile2 = new File("c:\\temp\\newFile.txt");
		File newFile3 = new File("c:"+File.separator+"temp"+File.separator+"newFile.txt");
		File newFile4 = new File("c:/temp/newFile.txt");
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());
		//경로
		System.out.println(System.getProperty("user.dir"));
		System.out.println(newFile2.getAbsolutePath());
	}
}
