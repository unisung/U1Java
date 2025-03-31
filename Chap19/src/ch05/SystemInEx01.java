package ch05;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx01 {
	public static void main(String[] args) throws Exception {
	 InputStream is = System.in;
	 int data;
//	 while((data=is.read())!='\n' ){
//		 System.out.println(data);
//	 }
	 
	 while((data=is.read())!=13 ){
		 System.out.println(data);
	 }
	}
}
