package ch04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutPutStreamEx01 {
	public static void main(String[] args) throws Exception {
	 //파일객체 생성
	 File outFile = new File("c:/temp/FileOutPutStream1.txt");
	 //파일은 자동생성이 안됨.
	 //OutPutStream의 생성자로 전달되면 파일이 만들어짐
	 //if(!outFile.exists()) outFile.createNewFile();
	 
	 //#1 1-byte씩 쓰기
	 OutputStream os1 = new FileOutputStream(outFile);//overwrite
	 os1.write('J');
	 os1.write('A');
	 os1.write('V');
	 os1.write('A');
	 os1.write('\r'); // ASCII 13
	 os1.write('\n'); // ASCII 10
	 
	 os1.close();// FileOutputStream.txt와 연결 끊기
	 
	 //#2.append
	 OutputStream os2 = new FileOutputStream(outFile,true);//append
	 byte[] arr = "Hello!".getBytes(); // String -> byte[]
	 
	 os2.write(arr);// byte단위 배열로 저장
	 os2.write('\n');//개행 ASCII 10
	 
	 os2.close();
	 
	 //#3. n-byte 단위 쓰기
	 OutputStream os3 = new FileOutputStream(outFile,true);//append
	 byte[] arr2 = "Better the last smile than the first laughter".getBytes();
	 os3.write(arr2,7,8);
	 os3.close();
	}
}
