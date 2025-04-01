package ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteAndReaderEx01 {
	public static void main(String[] args) {
		File writeFile = new File("c:/temp/test.txt");
		
		//#1. 쓰기
		try(Writer writer = new FileWriter(writeFile);
			BufferedWriter bw = new BufferedWriter(writer)){
			bw.write("안녕하세요");
		}catch(Exception e) {}
		
		//#2. 읽기
		char[] arr = new char[5];
		try(Reader reader = new FileReader(writeFile);
			BufferedReader br = new BufferedReader(reader)){
			//int data;
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		}catch(Exception e) {}
	}
}
