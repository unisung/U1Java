package ch06;

public class A {
	int a=10;
	public A() {
		super();
    System.out.println("A생성자");
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}
class B extends A{
	public B() {
		super();
	System.out.println("B생성자");
	}
	public B(int a) {
		System.out.println("B-매개변수1개생성자");
	}
}
class C extends B{
	public C() {
		super();
	System.out.println("C생성자");
	}
	public C(int a) {
		super(a);
		System.out.println("C-매개변수1개생성자");
	}
}