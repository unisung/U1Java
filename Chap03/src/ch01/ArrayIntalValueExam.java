package ch01;

public class ArrayIntalValueExam {
	public static void main(String[] args) {
		int[] arr1 =new int[2];
		double[] arr2 =new double[2];
		boolean[] arr3 =new boolean[2];
		String[] arr4 =new String[2];
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		System.out.println(arr4[0]);
		
		arr1[0] = 10; // 0 -> 10
		arr4[0] = "hello" ; // null -> "hello"
		System.out.println(arr1[0]);
		System.out.println(arr4[0]);
		
		
	}
}
