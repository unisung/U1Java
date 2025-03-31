package ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx01 {
	public static void main(String[] args) throws Exception {
	  //입력 파일 생성
		File inFile = new File("c:/temp/FileInputStream1.txt");
		
	 //InputStream 생성(파일로 부터 전달되는 byte값을 전달할 통로)
	  InputStream is = new FileInputStream(inFile);
	  
	  //읽어들여서 모니터(console)에 출력하기
	  int data; //read()메소드의 출력타입이 int이므로
	  while((data=is.read())!=-1) {
		  System.out.println("읽은 데이터:"+(char)data+" 남은 바이트 수:"+is.available());
	  }
	  //InputStream 자원반납
	  is.close();
	}
}
