package ch03;

public class A {
	int a = 3; //필드
	void abc(){
	int b = 5; //지역변수
	
      class B {
	       void bcd(){
	         System.out.println(a); //필드 (O) 
	         System.out.println(b); //지역변수 (O)      
	         a=7; //필드값 변경 (O)
	         //b=7; //지역변수값 변경 (X)
	      }
	    }
	    B bb = new B();
	    bb.bcd();
	   
	   class C{}
	  }
	
	void bcd() {
		class C{}
		class D{}
	}
}

