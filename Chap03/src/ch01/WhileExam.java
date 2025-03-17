package ch01;

import java.util.HashSet;
import java.util.Set;

public class WhileExam {
	public static void main(String[] args) {
	 int count=0;
	 Set<Integer> set = new HashSet<Integer>();
	 
	 while(set.size()<6) {
		 int a=	(int)(Math.random()*45)+1; // 0.0*45<= <1.0*45
		 set.add(a);
		 count++;
	 }
	 
	 System.out.println(set);
	 System.out.println(count);
	}
}
