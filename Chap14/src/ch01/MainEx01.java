package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx01 {
	public static void main(String[] args) {
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 
	 try {
		Class cls = Class.forName("java.lang.Object");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

	 InputStreamReader isr = new InputStreamReader(System.in);
	 try {
		isr.read();
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
	 try {
		FileInputStream fis = new FileInputStream("text.txt");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 
	 B b1 = new B();
	 try {
		B b2 = (B)b1.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

class B{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}