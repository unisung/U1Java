package ch08;

public class MainEX01 {
	public static void main(String[] args) {
	 //InterC c= new InterC();
		InterC c = new C();
		c.m1();
		c.m2();
		//c.m3();
		
		//무명 인터페이스
		InterC c1 = new InterC() {
			@Override
			public void m1() {}//상속
			@Override
			public void m2() {}//상속
			public void m3() {}//추가된 메소드
		};
		c1.m1();
		c1.m2();
		//c1.m3();
		
		//Lambda
		InterA a = new InterA() {
			@Override
			public void m1() {}//상속
			public void m2() {}//추가된 메소드
		};
		a.m1();
//		a.m2(); //추가된 메소드 접근 불가
		
		//Lambda - 인터페이스내에 추상메소드 1개
		//전제  = 을 기준으로 왼쪽타입과 오른쪽 타입이 동일
		InterA a2 = () -> {	} ;
		a2.m1();


	}
}
 