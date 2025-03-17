package ch01;

public abstract class Office {
	//변수=필드=property=전역변수
	String dept;
	
	abstract double cal();
	final void greet() {}//내용을 그대로 사용-강제
}
