package ch01;

public class MethodEx {
	//#. 리턴타입:void + 매개변수: 없음
	  void print() {
	    System.out.println("안녕");
	  }
	  //#. 리턴타입: int + 매개변수: 없음
	  int data() {
	    return 3;
	  }
	  //#. 리턴타입: double + 매개변수: 2개
	  double sum(int a, double b) {
	      return a+b;
	  }
	  //#. 리턴타입: void + 매개변수 : 1개 + 내부 함수종료(return 포함)
	  void printMonth(int m) {
	    if(m<0 || m>12) {
	      System.out.println("잘못된 입력!");
	      return;
	    }
	    System.out.println(m+"월 입니다.");
	  }
	  
	  public static void main(String[] args) {
		 MethodEx a = new MethodEx();
		 a.printMonth(5);
		 a.printMonth(15);
	}
}
