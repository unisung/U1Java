package ch01;

import java.util.Arrays;

public class CallByMethodEx {
	public static void main(String[] args) {
	
		int[] array = {1,2,3};
		
		modifyData(array);
		
		printArray(array);
		
		modifyData2(array);
		
		printArray(array);
	}
	
	public static void modifyData(int[] a) {
		a[0] = 4; a[1] = 5; a[2] = 6;
	}
	
	public static void modifyData2(int[] a) {
		int[] b = new int[a.length];
		b = Arrays.copyOf(a, a.length); //copyOf(배열,길이)
		b[0] = 7; b[1] = 8; b[2] = 9;
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}

