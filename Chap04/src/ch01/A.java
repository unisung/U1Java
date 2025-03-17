package ch01;

//클래스 소스파일에 생성자가 하나도 없으면
//컴파일시 default생성자를 추가
//그러나, 생성자가 소스파일에 하나라도 있으면
//컴파일시 생성자를 추가하지 않음
public class A {

  public static void main(String[] args) {
	A a = new A();
}
  
}
