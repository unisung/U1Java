package ch05;

public class A {
  interface B{
	  void bcd();
  }
}

class C implements A.B{
	@Override
	public void bcd() {
	System.out.println("인터페이스 구현 클래스 생성");	
	}
}
