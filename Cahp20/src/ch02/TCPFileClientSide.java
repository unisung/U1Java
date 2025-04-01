package ch02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileClientSide {
	public static void main(String[] args) {
			System.out.println("<<Client>>");
		try(Socket socket = new Socket(InetAddress.getByName("localhost"), 10000)){
			System.out.println("Server에 접속 완료");
			System.out.println("접속 Server 주소: "+socket.getInetAddress()+":"+socket.getPort());
			
			 DataInputStream dis 
			    = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			  DataOutputStream dos 
			    = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream())); 
			  
			 //전송할 파일객체 새성
			 File file = new File("c:/temp/ImageFileUsingTCP.jpg");
			 //파일정보 읽기
			 FileInputStream fis = new FileInputStream(file);
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 System.out.println("파일 전송:"+file.getName());
			 
			 //#1.파일전송
			 dos.writeUTF(file.getName());
			 
			 //#2. 파일데이터 전송
			 byte[] data = new byte[2048];
			 int len;
			 while((len=bis.read(data))!=-1) {//파일로부터 2048byte씩 읽어서 전송
				 dos.writeInt(len); //읽은 데이터 길이
				 dos.write(data,0,len);//전송데이타
				 dos.flush();
			 }
			 dos.writeInt(-1);//파일끝 
			 dos.flush();
			 
			 //서버로 부터 응답 받기
			 String str = dis.readUTF();
			 System.out.println(str);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
