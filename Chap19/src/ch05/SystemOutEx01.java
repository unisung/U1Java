package ch05;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutEx01 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		os.write('A');//Stream객체 'A'를 write
		os.flush(); //Stream의 'A'를 모니터로 밀어내기
		
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write(13); // \r
		os.write(10); // \n
		os.flush(); // --  flush()를 반드시 추가하자
		
		//# n-byte 출력
		byte[] byteArr1 = "Hello".getBytes();
		os.write(byteArr1);
		os.flush(); //  -- flush()를 반드시 추가하자
		
		//
		byte[] byteArr2 = "Better the last smile than the first laughter.".getBytes();
		os.write(byteArr2,7,8);
		os.flush(); // --flush()를 반드시 추가하자.
	}
}
