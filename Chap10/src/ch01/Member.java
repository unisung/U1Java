package ch01;

public class Member {
	Human human = new Student(); //필드 - 필드의 다형성
	
	public Member(Human human) {
		this.human = human;
	}

	void m1(Human human) {
		System.out.println(human);
		
	}
	
	void eatFruit(Fruit fruit) {
		fruit.kind();
	}
	
	public static void main(String[] args) {
		//객체의 다형성
		Human human1 = new Worker();
		//
		Member m = new Member(human1); // Worker -> Human
		Apple apple = new Apple();
		//메소드의 매개변수로 Fruit이 아닌 Apple전달됨 -> Fruit으로 변환
		//매개변수의 다형성
		m.eatFruit(apple); 
	}
}
