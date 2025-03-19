package ch04;

public class MainEx {
	public static void main(String[] args) {
		C c= new C();
		//방법1.
		InterA a1 = new B();
		c.cde(a1);
		
		//방법2.
		c.cde(new B());
		//방법3.
		InterA a2 = new InterA() {
			@Override
			public void bcd() {
				System.out.println("무명인터페이스");
			}
		};
		c.cde(a2);
		//방법4.
		c.cde(new InterA() {
			@Override
			public void bcd() {
				System.out.println("무명인터페이스");
			}});
		
		//방법5. - 인터페이스의 추상메소드 1개
		InterA a3 =  ()-> System.out.println("무명인터페이스");
		c.cde(a3);
		
		//방법6.
		c.cde(() -> System.out.println("무명인터페이스") );
		
	}
}
