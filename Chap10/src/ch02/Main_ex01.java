package ch02;

public class Main_ex01 {
	public static void main(String[] args) {
		//참조변수 b는 B타입 범위를 참조함
		B b = new B();
		System.out.println(b.m);//부모클래스에 있던 m
		System.out.println(b.n);//자식클래스에서 추가된 n
		b.abc();//부모클래스에 있던 abc()
		b.bcd();//자식클래스에서 추가된 bcd()
		
		//참조타입 a는 A타입 범위만 참조함
		A a = new B();
		System.out.println(a.m);//부모클래스에 있던 m
		//System.out.println(a.n);//자식클래스에서 추가된 n
		a.abc();//부모클래스에 있던 abc()
		//a.bcd();//자식클래스에서 추가된 bcd()
		
		//원래 B객체를 참조하는 변수 a가 참조하는 타입범위를 B로 변환
		B b1 = (B)a;
		System.out.println(b1.m);//부모클래스에 있던 m
		System.out.println(b1.n);//자식클래스에서 추가된 n
		b1.abc();//부모클래스에 있던 abc()
		b1.bcd();//자식클래스에서 추가된 bcd()
	}
}
