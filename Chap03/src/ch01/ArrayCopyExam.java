package ch01;

import java.util.Arrays;

public class ArrayCopyExam {
	public static void main(String[] args) {
	 int[] arr1 = {1,2,3};
	 int[] arr2 = arr1;
	 
	 System.out.println(arr1[1]);
	 System.out.println(arr2[1]);
	 
	 arr1[1] = 10;
	 System.out.println(arr1[1]);
	 System.out.println(arr2[1]);
	 
	 //deep copy
	 int[] arr3 = new int[3];
	 for(int i=0;i<arr1.length;i++) {
		 arr3[i] = arr1[i];
	 }
	 System.out.println(arr1[1]);
	 System.out.println(arr2[1]);
	 arr1[1] = 100;
	 System.out.println(arr1[1]);
	 System.out.println(arr2[1]);
	 System.out.println(arr3[1]);
	 
	 //내용 출력
	System.out.println(Arrays.toString(arr3));
	 
	}
}
