package ch07;

public class MainEX01 {
	public static void main(String[] args) {
	
		Animal animal = new Cat2();
		animal.cry();//상속
		animal.m1();//상속
		//animal.cry2();//추가된 메소드
		
		//무명클래스로 선언
		Animal animal2 = new Animal() {
			@Override
			void cry() {}//상속
			void cry2(){}//자식클래스에 추가된 메소드
		};
		animal2.cry();
		animal2.m1();
		//animal2.cry2();
		
		Animal animal3 = new Animal() {
			@Override
			void cry() {}//상속
			void cry2(){}//자식클래스에 추가된 메소드
		};
	}

}
