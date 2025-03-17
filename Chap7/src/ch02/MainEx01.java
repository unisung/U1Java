package ch02;

public class MainEx01 {
	public static void main(String[] args) {
		//n에 접근 - n은 static멤버
		System.out.println(A.n);//클래스명.멤버
		
		//m에 접근 - m은 instance멤버
		A a = new A();
		System.out.println(a.m); //인스턴스명.멤버		
	}
}
