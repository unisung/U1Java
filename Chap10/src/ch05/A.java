package ch05;

public class A extends Object{
	A(){ super();}
	void abc() {System.out.println("A 클래스 abc()"); }
	public static void main(String[] args) {
		A a = new B();
		a.abc();
		
		B b = (B)a;
		b.cde();
	}
}
class B extends A{
	@Override
	void abc() { System.out.println("B 클래스 abc()"); }
	void bcd() { this.abc(); abc();} //B자신 클래스 내에서 메소드 호출
	void cde() { super.abc();} //부모클래스의 메소드호출 super.메소드();
}
