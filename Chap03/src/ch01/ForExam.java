package ch01;

public class ForExam {
	public static void main(String[] args) {
		for(int i=0,j=0; i<10; i++,j++) {
			System.out.println(i+j);
		}
		
		//향상된 for문
		int[][] arr = {{1,2,3},{4,5,6,7},{8,9,10}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int[] a:arr) {
			for(int b: a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
	}
}
