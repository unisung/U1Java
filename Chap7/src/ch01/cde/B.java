package ch01.cde;
//import ch01.abc.A; // Ctrl + Shift + o
import ch01.abc.*; //ch01.abc 패키지의 모든 클래스를 import

public class B {
	void m1() {
		//ch01.abc.A a = new ch01.abc.A(); // 1번
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		
		C c= new C();
		//D d = new D();
		
		a.a=10; //public
//		a.b=10; //pr0tected
//		a.c=10;
//		a.d=10;
		
	}
}