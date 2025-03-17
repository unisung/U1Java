package ch01;

public class TypeCheck {
	public static void main(String[] args) {
		float f = 1.0000001f;
		System.out.println(f); // 1.0000001
		float f2 = 1.00000001f;
		System.out.println(f2); // 1.0

		double d1 = 1.000000000000001;
		System.out.println(d1); // 1.000000000000001
		double d2 = 1.0000000000000001;
		System.out.println(d2); // 1.0

	}
}
