package ch01;

public class OrientEx {
	public static void main(String[] args) {
		Integer i = 10; // class Integer extends Object
		String s = "10";// class String extends Object
		
		//자바에서 모든 클래스의 최상위 객체(조상)은 Object
		Object o;
		
		//객체에서 연산(javascript, python)
		o=i;
		System.out.println(o);
		o=s;
		System.out.println(o);
		
		o=10;
		o="10";
		

	}

}
