package ch02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileServerSide {
	public static void main(String[] args) {
	  System.out.println("<<Server>>");
	  try(ServerSocket serverSocket = new ServerSocket(10000);) {
		  Socket socket = serverSocket.accept();//클라이언트 대기
		  System.out.println("client연결 수락");
		  System.out.println("접속client 주소:"+socket.getInetAddress()+":"+socket.getPort());
		  
		  DataInputStream dis 
		    = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		  DataOutputStream dos 
		    = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream())); 
		  
		  //전송 받은 파일 이름 출력
		  String receivedFileName = dis.readUTF();
		  System.out.println("파일수신:"+receivedFileName);
		  
		  //파일정보
		  File file = new File("c:/temp/copy_"+receivedFileName);
		  FileOutputStream fos = new FileOutputStream(file);
		  BufferedOutputStream bos = new BufferedOutputStream(fos);
		  
		  byte[] data = new byte[2048];
		  int len;
		  while((len=dis.readInt())!=-1) {
			  dis.read(data,0,len); //리모트로부터 데이타 읽기
			  bos.write(data,0,len);//로컬에 데이타 저장
			  bos.flush();//buffer내용 밀어내기
		  }
		  System.out.println("파일 수신완료");//내 모니터에 출력
		  dos.writeUTF("전송 처리 완료");//리모터에 전송
		  dos.flush();//buffer 비우기

	  }catch(Exception e) {
		  System.out.println("해당포트를 열 수 없습니다.");
		  System.exit(0);//프로그램 종료
	  }
	  System.out.println(" - client 접속 대기...");
	}
}
