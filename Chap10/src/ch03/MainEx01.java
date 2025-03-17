package ch03;

public class MainEx01 {
	public static void main(String[] args) {
		A a = new A();
		//B b = (B)a;
		if (a instanceof B) {// A타입 객체가 B타입으로 변환가능?
			B b = (B)a;
		}else {
			System.out.println("A타입객체는 B타입으로 변환불가");
		}
		
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A); //true
		System.out.println(aa instanceof B); //false

		System.out.println(ab instanceof A); //true
		System.out.println(ab instanceof B); //true
		
		if(aa instanceof B) {
		    B b = (B)aa;
		    System.out.println("aa를 B로 casting을 완료하였습니다.");
		  } else {
		    System.out.println("aa는 B로 casting을 할 수 없습니다.");
		  }
		if(ab instanceof B) {
		    B b = (B)ab;
		    System.out.println("ab를 B로 casting을 완료하였습니다.");
		 } else {
		    System.out.println("ab는 B로 casting을 할 수 없습니다.");
		 }

		if("안녕" instanceof String) {
		    System.out.println("\"안녕\"은 String 입니다.");
		  }


	}
}
