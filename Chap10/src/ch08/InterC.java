package ch08;
//다중상속 - 부모인터페이스의 메소들의 누적집합
public interface InterC 
   extends InterA, InterB {
	//void m1();
	//void m2();
}
//구현체 
class C implements InterC{
	@Override
	public void m1() {}//상속메소드
	@Override
	public void m2() {}//상속메소드
	void m3() {}//추가된 메소드
}
//상속 후 구현
class D extends C implements MyInter{
	@Override
	public void k1() {}
}