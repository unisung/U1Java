package ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx03 {
	public static void main(String[] args) throws Exception {
	  //입력 파일 생성
		File inFile = new File("c:/temp/FileInputStream1.txt");
		
	 //InputStream 생성(파일로 부터 전달되는 byte값을 전달할 통로)
	  InputStream is = new FileInputStream(inFile);
	  
	  //읽어들여서 모니터(console)에 출력하기
	  //버퍼생성
	  byte[] byteArray1 = new byte[9];//길이는 임의 지정
	  int offset=3; int length=6;
	  int data; //read()메소드의 출력타입이 int이므로
	  while((data=is.read(byteArray1, offset, length))!=-1) {
		  for(int i=0;i<offset+data;i++) {
			  System.out.print((char)byteArray1[i]);
			  System.out.println(":count="+data);
		  }
		  System.out.println(":count="+data);
		  System.out.println();
	  }
	  //InputStream 자원반납
	  is.close();
	}
}
