package ch06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputEx01 {
	public static void main(String[] args) throws IOException {
		//파일객체 생성
		File dataFile = new File("c:/temp/file01.data");
		//데이터 읽기
		try(InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		}catch(Exception e) { e.printStackTrace();}
	}
}