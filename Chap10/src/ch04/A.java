package ch04;

//필드는 overring안됨
public class A extends Object {
	A(){
		super();//Object() 호출
	}
 int m=3;
 static int j=6;
 static void print() {System.out.println("static A");}
 
 public static void main(String[] args) {
	A a = new A();
	B b = new B();
	A a1 = new B();//부모클래스의 값출력
	
	System.out.println(a.m);
	System.out.println(b.m);
	System.out.println(a1.m);
	System.out.println(a.j);
	System.out.println(b.j);
	System.out.println(A.j);
	System.out.println(B.j);
	System.out.println(a1.j);
	a1.print();//static메소드는 B클래스에서 재정의해도 A클래스에서 재정의하기전의 내용으로 실행
	a.print();
	b.print();
}
}
class B extends A{
	int m=4;
	static int j=7;
	static void print() {System.out.println("static B");}
}

