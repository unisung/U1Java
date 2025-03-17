package ch01;

public class TypeCasting2Exam {
	public static void main(String[] args) {
		double a = 5 + 3.5; 	//8.5
		int b = (int)(5 + 3.5); 		//오류 5.0 + 3.5
		System.out.println(b);
		double c = 5/2.0; 		//2.5
		
		int a1 = 3 + 5; 		//8
		int b1 = 8/5; 		//1
		System.out.println(b1);
		float c1 = 3.0f + 5.0f;     	//8.0
		double d1 = 8.0/5.0; 	//1.6

		byte a2 = 3;
		short b2 = 5;
		int c2 = a2+b2;   		//8
		double d2 = a2+b2;
	}
}