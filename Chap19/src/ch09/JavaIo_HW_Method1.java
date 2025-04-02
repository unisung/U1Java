package ch09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class JavaIo_HW_Method1 {
	public static void main(String[] args) throws IOException {
		//스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		//소스파일 위치 받기
		System.out.println("소스파일의 위치를 파일명과 함께 절대경로로 입력하세요(경로에 반드시 한글 포함)");
		String sourceFilePath = scanner.nextLine();
		System.out.println(sourceFilePath);
		
		//복사파일 위치 받기
		System.out.println("복사파일의 위치를 파일명과 함께 절대경로로 입력하세요(경로에 반드시 한글 포함)");
		String destinationFilePath = scanner.nextLine();
		System.out.println(destinationFilePath);
		
		//파일객체 생성
		File file = new File(sourceFilePath);
		
		//파일 존재 여부 판별
		if(!file.exists()) {
			file.createNewFile();
			try (FileWriter fw = new FileWriter(file);
				BufferedWriter writer = new BufferedWriter(fw);){
				writer.write("hello, 이것은 과제 예제입니다.");
			}
		}
		
		try (InputStream inputStream = new FileInputStream(sourceFilePath);
			OutputStream outputStream = new FileOutputStream(destinationFilePath)){
			
			byte[] buffer = new byte[1024];
			int bytesRead;
			
			while ((bytesRead = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, bytesRead);
            }
			
			System.out.println("File 복사가 완료되었습니다.");
		} catch (Exception e) {
			System.out.println("오류발생"+ e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
