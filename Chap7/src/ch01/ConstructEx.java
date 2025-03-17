package ch01;

public class ConstructEx {
	public static void main(String[] args) {
		  //#1. 기본생성자를 이용한 객체 생성
		  A1 a = new A1();
		  B b = new B();
		  //C c1 = new C(); //오류 (기본생성자 없음)
		  C c = new C(3);

		  //#2. 메서드 호출
		  a.work();//0
		  b.work();//0
		  c.work();//3

	}
}

class A1{
  int m;
  void work() {
    System.out.println(m);
  }
}
class B{int m;
  void work() {
    System.out.println(m);
  }
  B(){ //기본생성자
  } 
}
class C{int m;
  void work() {
    System.out.println(m);
  }
  C(int a){
    m=a;
  }
}
