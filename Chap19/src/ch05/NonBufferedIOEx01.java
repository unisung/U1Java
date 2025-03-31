package ch05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferedIOEx01 {
	public static void main(String[] args) {
		//#1.파일생성
//		File orgfile = new File("c:/temp/mycat_origin.jpg");//원본파일객체
//		File copyfile1 = new File("c:/temp/mycat_copy1.jpg");//복사본1
		File orgfile = new File("c:/temp/sunset.jpg");//원본파일객체
		File copyfile1 = new File("c:/temp/sunset_copy1.jpg");//복사본1
		
		//#2.파일 copy - Buffer없는 복사
		long start, end, time1;
		start = System.nanoTime();//시작시각
		try(InputStream is = new FileInputStream(orgfile);//원본
			OutputStream os = new FileOutputStream(copyfile1)){ //사본
			
			int data;
			while((data=is.read())!=-1) {
				os.write(data);
			}
			os.flush();// -- flush()를 붙이자
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		end = System.nanoTime();//종료시각
		time1 = end - start;//작업시간
		System.out.println("Withot BufferedXXXStream:"+(time1));
	}
}
