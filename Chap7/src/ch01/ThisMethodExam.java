package ch01;

public class ThisMethodExam {
	public static void main(String[] args) {
		AA a = new AA();
	}
}
class AA{
	int m1, m2,m3,m4;

	public AA() {
		this.m1 = 1;
		this.m2 = 2;
		this.m3 = 3;
		this.m4 = 4;
	}
	public AA(int a) {
		this();
		this.m1 = a;
	}
	public AA(int a, int b) {
		this(a);
		this.m2 = b;
	}
}