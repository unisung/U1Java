package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedIOEx01 {
	public static void main(String[] args) {
		//#1.파일생성
//		File orgfile = new File("c:/temp/mycat_origin.jpg");//원본파일객체
//		File copyfile2 = new File("c:/temp/mycat_copy2.jpg");//복사본2
		File orgfile = new File("c:/temp/sunset.jpg");//원본파일객체
		File copyfile2 = new File("c:/temp/sunset_copy2.jpg");//복사본2
		
		//#2.파일 copy - Buffer있는 복사
		long start, end, time2;
		start = System.nanoTime();//시작시각
		try(InputStream is = new FileInputStream(orgfile);//원본
			//버퍼객체 
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile2);
			//버퍼객체
			BufferedOutputStream bso = new BufferedOutputStream(os); ){ //사본
			
			int data;
			while((data=is.read())!=-1) {
				os.write(data);
			}
			os.flush();// -- flush()를 붙이자
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		end = System.nanoTime();//종료시각
		time2 = end - start;//작업시간
		System.out.println("With BufferedXXXStream:"+(time2));
	}
}
