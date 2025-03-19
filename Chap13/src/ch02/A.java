package ch02;

public class A {
	int a=3;
	static int b=4;
	void method1() {System.out.println("인스턴스 메소드");}
static void method2() {System.out.println("static 메소드");}
	//static 멤버 class
   static class B{
	    int a=3;
		static int b=14;
		void bcd() {
			//System.out.println(A.this.a);//static 클래스에서 this사용불가
			//System.out.println(A.this.b);//static 클래스에서 this사용불가
			//System.out.println(A.a);//인스턴스 멤버 X
			System.out.println(A.b);//static 멤버 O
			System.out.println(b);//static 멤버 O
			
			//method1();//인스턴스 멤버 X
			method2();//static 멤버 O
			}
   }
}
