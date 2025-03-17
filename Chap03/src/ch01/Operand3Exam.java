package ch01;

public class Operand3Exam {
	public static void main(String[] args) {
		int a;
		if(3>5) {
		    a=6;
		} else {
		    a=9;
		}
		System.out.println(a);
		
		a = 3>5 ? 6 : 9;
		System.out.println(3>5?6:9);
		
		double score = 92.3;
		char grade =' ';
		if(score> 90) {
			grade = 'A';
		}else if(score> 80) {
			grade = 'B';
		}else if(score> 70) {
			grade = 'C';
		}else
			grade = 'F';
		
	   grade = score > 90 ? 'A':(score > 80 ? 'B':(score>70?'C':'F'));
	   System.out.println(grade);
		


	}
}
