package ch01;

public class ShortCircuitExam {
	public static void main(String[] args) {
		int a = -1, b=-1, c=3;
		System.out.println(false && (5/++a)>6);//false
		System.out.println(true || (5/++b)>6); //true
		System.out.println(true ^ c++>6);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		

	}
}
