package ch07;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriterEx01 {
	public static void main(String[] args) {
		//파일객체 생성
	File file = new File("c:/temp/ReaderWRiterFile.txt");
	//#1 저장하기
	try(Writer writer = new FileWriter(file)){
		 writer.write("안녕하세요\n".toCharArray());//['안']['녕']['하']['세']['요']['\n']
		 writer.write("Hello");
		 writer.write("\r");
		 writer.write("\n");
		 writer.write("반갑습니다.",2,3);
		 writer.flush();
	}catch(Exception e) { }
   //#2 읽기
	try(Reader reader = new FileReader(file)){
		int data;
		while((data=reader.read())!=-1) {
			System.out.print((char)data);
		}
	}catch(Exception e) { }
	}
}