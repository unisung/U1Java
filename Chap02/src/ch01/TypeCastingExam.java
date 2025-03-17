package ch01;

public class TypeCastingExam {
	public static void main(String[] args) {
		int a = (int)3.2;       //3
		double b = (double)a;   //3.0
		byte c = (byte)5.3;     //5
		short d = (short)10;    //10

		long a1 = (long)10;      //10
		long b1 = 10L;           //10
		float c1 = (float)5.8;   //5.8
		float d1 = 5.8F;         //5.8

		byte b2 = 120;// -128~ 127 
		for(int i=1;i<300;i++) {
			b2--;//b2=b2+1
			System.out.println(b2);
		}
		
		byte b3 = (byte)128;
		System.out.println("결과:"+b3);
	}
}
