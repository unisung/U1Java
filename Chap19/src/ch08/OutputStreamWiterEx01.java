package ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWiterEx01 {
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("c:\\temp\\ost2.txt");
				OutputStreamWriter osw = new OutputStreamWriter(os)) {
			osw.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 모두 포함되어 있습니다.");
			osw.write('\n');
			osw.write("Good Bye!!!\n\n");
			osw.flush();
		} catch (Exception e) {
		}
		
		// #2 읽기
		try (InputStream is = new FileInputStream("c:\\temp\\ost2.txt");
				InputStreamReader ir = new InputStreamReader(is, "utf-8");) {
			int data;
			while ((data = ir.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println(ir.getEncoding());// 문자셋 엔코딩 출력
		} catch (Exception e) { }
	}
}
