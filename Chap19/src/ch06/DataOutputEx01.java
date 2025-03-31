package ch06;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputEx01 {
	public static void main(String[] args) throws IOException {
		//파일객체 생성
		File dataFile = new File("c:/temp/file01.data");
		if(!dataFile.exists()) dataFile.createNewFile();//생성
		//데이터 쓰기
		try(OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요."); //항상 UTF8로 저장
			dos.flush();
		}catch(Exception e) { e.printStackTrace();}
	}
}