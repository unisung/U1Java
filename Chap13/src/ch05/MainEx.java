package ch05;

public class MainEx {
	public static void main(String[] args) {
	C c = new C();
	c.bcd();
	
	A.B b = new A.B() {
		@Override
		public void bcd() {
			System.out.println("익명이너클래스로 객체 생성");
		}
	};
	b.bcd();
	
	A.B d = () -> System.out.println("람다");
	d.bcd();
	}
}
