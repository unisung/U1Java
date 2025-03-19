package ch01;

public class A {
  //instance맴버들
  public int a=3;
  protected int b = 4;
  int c = 5;
  private int d = 6;
  void abc() {System.out.println("A메소드");}
  
  //inner class
  class B{
	  int a = 13;
	  int b = 14;
	  void abc() {System.out.println("B메소드");}
	  void bcd() {
		  //맴버변수와 로컬변수가 겹칠경우
		  //가까운 변수선택(로컬변수)
		  System.out.println(a);
		  System.out.println(b);
		  //바깥쪽 변수 선택
		  System.out.println(c);
		  System.out.println(d);
		  //this로 접근하기
		  //this는 메소드가 속한클래스 자신 변수 선택
		  System.out.println(this.a);
		  System.out.println(this.b);
		  //바깥쪽클래스.this는 바깥쪽 변수 선택
		  System.out.println(A.this.a);
		  System.out.println(A.this.b);
		  abc();//안쪽
		  A.this.abc();//바깥쪽
		  
	  }
  }
}
