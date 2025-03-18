package ch04;

//필드는 overring안됨
public class A {
 int m=3;
 static int j=6;
 
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
}
}
class B extends A{
	int m=4;
	static int j=7;
}

