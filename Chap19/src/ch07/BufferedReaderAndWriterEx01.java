package ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderAndWriterEx01 {
	public static void main(String[] args) {
		//파일객체 선언
	 File bufferedFile = new File("c:/temp/BufferedFile.txt");
	 
	 //#1.FileWriter/BufferedWriter를 이용한 파일 쓰기(UTF-8 모드)
	 try(Writer writer = new FileWriter(bufferedFile);
	     BufferedWriter bw = new BufferedWriter(writer)){
		 bw.write("안녕하세요\n".toCharArray());
		 bw.write("Hello");
		 bw.write("\n");
		 bw.write("반갑습니다",2,3);
		 bw.flush();
	 }catch(Exception e) {}
	 
	 //#2.FileReader/BufferedReader를 이요안 파일 읽기
	 try(Reader reader = new FileReader(bufferedFile);
		 BufferedReader br = new BufferedReader(reader)){
		 String data; // char[] charArr;
		 while((data=br.readLine())!=null) {// readLine()의 리턴타입은 String - null리턴
			 System.out.println(data);
		 }
	 }catch(Exception e) {}

	}
}
