package ch02;

import java.io.UnsupportedEncodingException;

public class EUCVsMS949Ex {
	public static void main(String[] args) throws Exception {
		byte[] b1 = "가".getBytes("EUC-KR");
		byte[] b2 = "가".getBytes("MS949");
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1,"EUC-KR"));
		System.out.println(new String(b2,"MS949"));
		System.out.println();
		
		byte[] b11 = "a".getBytes("EUC-KR");
		byte[] b21 = "a".getBytes("MS949");
		
		System.out.println(b11.length);
		System.out.println(b21.length);
		
		System.out.println(new String(b11,"EUC-KR"));
		System.out.println(new String(b21,"MS949"));
		System.out.println();
		
		byte[] b12 = "봵".getBytes("EUC-KR");
		byte[] b22 = "봵".getBytes("MS949");

		System.out.println(b12.length);
		System.out.println(b22.length);
		
		System.out.println(new String(b12,"EUC-KR"));
		System.out.println(new String(b22,"MS949"));
		System.out.println();
		
		

	}
}
