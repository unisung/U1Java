package ch01;

public class BitExam {
	public static void main(String[] args) {
		//비트연산 결과는 10진수로  출력
		System.out.println(3 & 10);
		System.out.println(0b00000011 & 0b00001010);
		System.out.println(0x03 & 0x0A);
		
		System.out.println(3 | 10);
		System.out.println(0b00000011 | 0b00001010);
		System.out.println(0x03 | 0x0A);

		System.out.println(3 ^ 10);
		System.out.println(0b00000011 ^ 0b00001010);
		System.out.println(0x03 ^ 0x0A);

	}
}
