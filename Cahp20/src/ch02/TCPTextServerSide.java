package ch02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTextServerSide {
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
		  
		  String str = dis.readUTF();
		  System.out.println("client:"+str);
		  dos.writeUTF("어서오세요!");
		  dos.flush();//buffer비우기!!!
	  }catch(Exception e) {
		  System.out.println("해당포트를 열 수 없습니다.");
		  System.exit(0);//프로그램 종료
	  }
	  System.out.println(" - client 접속 대기...");
	}
}
