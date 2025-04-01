package ch01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketEx01 {
	public static void main(String[] args) throws Exception {
		Socket socket1 = new Socket();
		Socket socket2 = new Socket("localhost",80);
		Socket socket3= new Socket("localhost",80, InetAddress.getLocalHost(), 10000);
		
		//
		System.out.println(socket2.getInetAddress() + ":" + socket2.getPort());


	}
}
