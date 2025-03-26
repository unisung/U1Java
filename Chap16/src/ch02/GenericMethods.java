package ch02;

public class GenericMethods {
//  public  <T>void method1(T t) {
//	  char c = t.charAt(0);
//	  System.out.println(c);
//  }
	public  <T extends String>void method1(T t) {
		  char c = t.charAt(0);//최상위 부모가 String이고,String에 charAt(인덱스)존재
		  System.out.println(c);
	 }
}
