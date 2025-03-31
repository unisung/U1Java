package ch02;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class UTF16VsUTF8Ex2 {
	public static void main(String[] args) throws Exception {
	 byte[] b1 = "가나다".getBytes("UTF-16");//2byte고정길이
	 byte[] b2 = "가나다".getBytes("UTF-8"); //1~4byte 가변
	 
	 System.out.println(b1.length);//8
	 System.out.println(b2.length);//9 - 한글 3byte, 영문 1byte
	 
	 for(byte b:b1) System.out.printf("%02X ", b);
	 System.out.println();
	 
	 for(byte b:b2) System.out.printf("%02X ", b);
	 System.out.println();
	 
	 System.out.println(new String(b1,"UTF-16"));//추출시 문자셋으로 생성
	 System.out.println(new String(b2,"UTF-8"));
	 
	 Charset cs1 = Charset.defaultCharset();
	 Charset cs2 = Charset.forName("MS949");
	 Charset cs3 = Charset.forName("UTF-8");
	 
	 System.out.println(cs1);
	 System.out.println(cs2);
	 System.out.println(cs3);
	 
	 System.out.println(Charset.isSupported("MS949"));
	 System.out.println(Charset.isSupported("UTF-8"));
	 

	}

}
