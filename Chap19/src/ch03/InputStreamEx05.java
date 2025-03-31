package ch03;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamEx05 {
	public static void main(String[] args) throws Exception{
		byte[] byteArray = new byte[8];
		InputStream is = new FileInputStream("c:/temp/FileInputStream2.txt");
		
		int count1;
		int offset=2; int length=6;
		
		count1 = is.read(byteArray, offset, length);
		System.out.println(count1);
		
		String str = new String(byteArray,0,offset+count1,Charset.defaultCharset());
		System.out.print(str);

	}
}
