package ch07;

//추상메소드가 1개라도 있으면 abstract로 선언
public abstract class Animal {
  abstract void cry();//추상메소드
  void m1() {}//일반 메소드
}

// 일반클래스에 absract를 붙이면 추상클래스
abstract class C{void m(){}}
//추상클래스 선언
abstract class Cat extends Animal{
	abstract void cry2();//
}

class Cat2 extends Cat{
	@Override
	void cry2() {}
	@Override
	void cry() {}
}