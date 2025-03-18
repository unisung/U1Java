package ch07;

public class A {
	int a=3;
	//final int b;
	final int b=5; //최초 한번 초기화 후 재 대입불간
	
	A(){
//		b=10;
		}
	   void m1() {System.out.println("A의 m1");}
 final void m2() {System.out.println("A의 m2");}
}

class B extends A{
	void m1() {System.out.println("B의 m1");}
	//void m2() {System.out.println("B의 m2");}
}
