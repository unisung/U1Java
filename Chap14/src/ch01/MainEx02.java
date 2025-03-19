package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx02 {
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
			Class cls = Class.forName("java.lang.Object");
			InputStreamReader isr = new InputStreamReader(System.in);
			isr.read();
			FileInputStream fis = new FileInputStream("text.txt");
			B b1 = new B();
			B b2 = (B) b1.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}