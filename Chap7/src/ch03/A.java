package ch03;

public class A {
	int a;
	static int b;
	
	void abc() {
		a=b;
		bdc();
		cde();
	}
	static void bdc() {
		//a=b;
		//abc();
		cde();
	}
	static void cde() {
		//a=b;
		//abc();
		bdc();
	}

}
