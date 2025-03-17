package ch01;

public class ThisExam {
	public static void main(String[] args) {
	 A2 a2 = new A2();
	 A2 a3 = new A2();
	 A2 a4 = new A2();
	}
}

class A2{
	int m;
	int n;
	void init(int a, int b) {
		int c=3;
		this.m=a;
		this.n=b;
	}
	void work() {
		this.init(2,3);
	}
}
