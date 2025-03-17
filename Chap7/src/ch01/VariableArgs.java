package ch01;

public class VariableArgs {
  double m1(int ...a) {
	  int sum=0;
	  for(int k: a) {
		  sum+=k;
	  }
	  return sum/a.length;
  }
  
  public static void main(String[] args) {
	  VariableArgs va = new VariableArgs();
	System.out.println(va.m1(1));
	System.out.println(va.m1(1,3,5));
	System.out.println(va.m1(1,2,3,4,5,6,7,8,9,10));
}
}
