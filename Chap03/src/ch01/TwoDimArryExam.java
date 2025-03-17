package ch01;

public class TwoDimArryExam {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{4,5,6,7},{8,9}};
		
		//가변형 길이 이차원배열
		int[][] arr2 = new int[3][];
		arr2[0] = new int[]{1,2,3};
		arr2[1] = new int[]{4,5,6,7};
		arr2[2] = new int[]{8,9};
		
		for(int[] ar1:arr2) {
			for(int a:ar1) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
