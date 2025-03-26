package ch01;

public class MainEX {
	public static void main(String[] args) {
	
     GenericMethods gm
      = new GenericMethods();
     
     //generic메소드 호출
     String str1 = gm.method1("안녕하세요");
     System.out.println(str1);
     String str2 = gm.<String>method1("안녕하세요");
     
     boolean bool1 = gm.<Double>method2(2.5,2.5);
     System.out.println(bool1);
     boolean bool2 = gm.method2(2.5,2.5);
     System.out.println(bool2);
     
     gm.mehtod3("국어", 80);
     gm.<String, Integer>mehtod3("국어", 80);
     
	}
}