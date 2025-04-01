package ch01;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerSocketEx01 {
	public static void main(String[] args) throws Exception {
		//#1.ServerSocket
		ServerSocket serverSocket1 = new ServerSocket();
		ServerSocket serverSocket2 = new ServerSocket(20000);
		//#2. 
		System.out.println(serverSocket1.isBound());
		System.out.println(serverSocket2.isBound());//
		//#2 serverSocket port바인딩
		serverSocket1.bind(new InetSocketAddress(InetAddress.getLocalHost(),10000));
		System.out.println(serverSocket1.isBound());
		//사용중인 port확인
		for(int i=0;i<65536;i++) {// 0 ~ 65535
			try {
				ServerSocket serverSocket = new ServerSocket(i);
			} catch (Exception e) {
				System.out.println(i+"번째 port 사용중...");
			}
		}//for
		serverSocket1.setSoTimeout(2000);//타임아웃설정
		try {
			Socket socket = serverSocket1.accept();
		}catch(Exception e) {
			System.out.println(serverSocket1.getSoTimeout()+"ms 시간 지나 종료");
		}
	}
}
