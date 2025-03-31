package ch04;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutPutStreamEx02 {
	public static void main(String[] args) throws Exception{
     byte[] arr1 = "안녕하세요".getBytes("MS949");
     OutputStream os = new FileOutputStream("c:/temp/FileOutputStream2.txt",false);
     os.write(arr1);
     os.write('\n');
     os.close();
     
//     //#3. n-byte단위 쓰기
     byte[] arr2 = "반갑습니다.".getBytes("MS949");
     OutputStream os2= new FileOutputStream("c:/temp/FileOutputStream2.txt",true);
     os2.write(arr2, 2, 4);
     os2.close();
	}
}
