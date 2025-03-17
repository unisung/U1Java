package ch01;

public class MinEX02 {
	public static void main(String[] args) {
	 //자식타입에 부모객체 생성하여 대입 불가
	 //B b = new A();
	 B b = new B(); //객체의 시작 B
	 A a = b;  // B -> A 로 upcasting(promotion)
	 B b1 = (B)a; //  A -> B 로 downcasting
	 //C객체 생성
	 C c = new C();
     B b2 = c; // C-> 부모인 B로 upcasting
     A a1 = b2; // B -> A로 upcasting
     B b3 = (B)a1; // A -> B로 downcasting
     C c2 = (C)b3; // B -> C로 downcasting (출발점으로 되돌아옴)
    // D d = (D)c2; //C -> D로 downcasting X - 실행시 오류발생
     
     C c3 = new C();
     B b4 = c3;
     F d = (F)b4;// 실행시 오류발생
	}
}
