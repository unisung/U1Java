package ch01;

public class InterExam {
	public static void main(String[] args) {
		//자바는 정수리터를을 int타입으로 인식
		byte a = 10;//int 10 -> byte10
		short b = -10;// int -10 -> short -10
		int c = 100;
		long d = -100L; //-100 -> long타입100으로 형변환(자동)
		System.out.println(a); //10
		System.out.println(b); //-10
		System.out.println(c); //100
		System.out.println(d); //-100
		
		System.out.println("---------------------");
		float a1 = 1.2f; //double 1.2 -> float 1.2
		double b1 = -1.5; //double
		double c1 = 5; //int 5 -> double 5.0
		System.out.println(a1); // 1.2
		System.out.println(b1); // -1.5
		System.out.println(c1); // 5.0


	}
}
