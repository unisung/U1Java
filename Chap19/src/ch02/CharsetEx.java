package ch02;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetEx {
	public static void main(String[] args) throws Exception {
		//#1-1. String의 getBytes()를 이용한 byte[] --> 문자열
		byte[] array1 = "안녕".getBytes();
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset());
		byte[] array3 = "베리".getBytes(Charset.forName("MS949"));
		byte[] array4 = "감사".getBytes("UTF-8");

		System.out.println(array1.length); 
		System.out.println(array2.length); 
		System.out.println(array3.length); 
		System.out.println(array4.length); 

	}
}
