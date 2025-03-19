package ch01;

import java.io.InputStreamReader;

public class MainEx04 {
	public static void main(String[] args) {
		//종료시 isr1.close() 자동실행
	try(InputStreamReader isr1 = new InputStreamReader(System.in)){
		char input = (char)isr1.read();
		System.out.println("입력글자 = "+input);
	}catch(Exception e) {
		e.printStackTrace();
	 }
	}
}
