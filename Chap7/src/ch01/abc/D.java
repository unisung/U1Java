package ch01.abc;
//생성자의 접근제한범위는 클래스의 접근제한범위와 같다.
public class D { 
	D() {
		A a1= new A();
		a1.a=10;
		a1.b=10;
		a1.c=10;
		//a1.d=10; //private
	}
}
