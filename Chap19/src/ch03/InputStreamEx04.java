package ch03;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamEx04 {
	public static void main(String[] args) throws Exception{
		byte[] byteArray = new byte[8];
		InputStream is = new FileInputStream("c:/temp/FileInputStream2.txt");
		
		int count1;
		
		while((count1 = is.read(byteArray))!=-1) {
			String str = new String(byteArray,0,count1,Charset.forName("MS949"));
			System.out.print(str);
			System.out.println(":count="+count1);
		}
		
	}
}
