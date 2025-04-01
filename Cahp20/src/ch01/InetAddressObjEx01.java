package ch01;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetAddressObjEx01 {
	public static void main(String[] args) throws Exception {
		//#1. InetAddress 객체 생성 - ip주소객체
		InetAddress ia = InetAddress.getByName("www.google.com");
		 int port = 10000;
		 InetSocketAddress isa1 = new InetSocketAddress(port);
		 InetSocketAddress isa2 = new InetSocketAddress("www.google.com", port);
		 InetSocketAddress isa3 = new InetSocketAddress(ia, port);
		 System.out.println(isa1); 
		System.out.println(isa2); 
		System.out.println(isa3); 
		System.out.println();
		 //#2. InetAddress 메서드
		System.out.println(isa2.getAddress()); //InetAddress ip주소
		 System.out.println(isa2.getHostName()); //host명
		System.out.println(isa2.getPort()); //1000 포트번호
	}
}
