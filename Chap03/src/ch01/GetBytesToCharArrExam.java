package ch01;

import java.util.Arrays;

public class GetBytesToCharArrExam {
	public static void main(String[] args) {
		String str8 = "Hello Java!";
		String str9 = "안녕하세요!";
		
		byte[] array1 = str8.getBytes();
		System.out.println(Arrays.toString(array1));
		//[72, 101, 108, 108, 111, 32, 74, 97, 118, 97, 33]
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array2));
		//[-66, -56, -77, -25, -57, -49, -68, -68, -65, -28, 33]

		char[] array3 = str8.toCharArray();
		System.out.println(Arrays.toString(array3));
		//[H, e, l, l, o,  , J, a, v, a, !]
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array4));
	}
}
