package ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class JavaIo_HW_Method2 {
	public static void main(String[] args) throws IOException {
		//표준 입력 스트림 생성
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//소스파일 위치 받기
		System.out.println("소스파일의 위치를 파일명과 함께 절대경로로 입력하세요(경로에 반드시 한글 포함)");
		String sourceFilePath = bufferedReader.readLine();
		System.out.println(sourceFilePath);
		
		//복사파일 위치 받기
		System.out.println("복사파일의 위치를 파일명과 함께 절대경로로 입력하세요(경로에 반드시 한글 포함)");
		String destinationFilePath = bufferedReader.readLine();
		System.out.println(destinationFilePath);
		
		
		//파일객체 생성
		File file = new File(sourceFilePath);
		
		//파일 존재 여부 판별
		if(!file.exists()) {
			file.createNewFile();
			//없으면 예제 파일 생성
			try (FileWriter fw = new FileWriter(file);
				BufferedWriter writer = new BufferedWriter(fw);){
				writer.write("hello, 이것은 과제 예제입니다.");
			}
		}
		//파일 복사
		try (InputStream inputStream = new FileInputStream(sourceFilePath);
			OutputStream outputStream = new FileOutputStream(destinationFilePath)){
			
			//버퍼 생성
			byte[] buffer = new byte[1024];
			int bytesRead;
			//inputStream으로 읽고 outputStream으로 파일에 쓰기
			while ((bytesRead = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, bytesRead);
            }
			
			System.out.println("File 복사가 완료되었습니다.");
		} catch (Exception e) {
			System.out.println("오류발생"+ e.getMessage());
		} finally {
			bufferedReader.close();
            inputStreamReader.close();
		}
	}
}
