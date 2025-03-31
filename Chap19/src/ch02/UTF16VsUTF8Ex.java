package ch02;

import java.io.UnsupportedEncodingException;

public class UTF16VsUTF8Ex {
	public static void main(String[] args) throws Exception {
	 byte[] b1 = "abc".getBytes("UTF-16");//2byte고정길이
	 byte[] b2 = "abc".getBytes("UTF-8"); //1~4byte 가변
	 
	 System.out.println(b1.length);//8
	 System.out.println(b2.length);//3
	 
	 for(byte b:b1) System.out.printf("%02X ", b);
	 System.out.println();
	 
	 for(byte b:b2) System.out.printf("%02X ", b);
	 System.out.println();
	 
	 System.out.println(new String(b1,"UTF-16"));//추출시 문자셋으로 생성
	 System.out.println(new String(b2,"UTF-8"));
	 

	}

}
