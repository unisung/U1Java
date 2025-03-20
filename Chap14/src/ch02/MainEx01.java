package ch02;

public class MainEx01 {
	public static void main(String[] args) throws Exception{
//	try {
       a();
//	}catch(Exception e) {}
	}
	
	static void a() throws Exception{
		b();
	}
	static void b() throws Exception{
		throw new Exception("예외발생");
	}
}
