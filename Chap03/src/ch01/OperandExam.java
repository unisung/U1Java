package ch01;

public class OperandExam {
	public static void main(String[] args) {
		// 산술연산자
		System.out.println(2+3);//+
		System.out.println(8-5);//-
		System.out.println(7*2);// x
		System.out.println(7/2); // 몫
		System.out.println(8%5); // 나머지
		
		System.out.println((double)7/2); // double 7.0 / int 2 -> 7.0 /2.0 
		
		//증감 연산 - 단독명령어
		int a=3;
		++a;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		int b=3;
		b--;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		
	}
}
