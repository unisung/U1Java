package ch01;

public class A {
	//instance멤버는 static멤버 호출
	void m1() {
		m2();
	}
	//static멤버는 instance멤버 호출불가
	static void m2() {
	//	m1();
	}

}
