package ch04;

public class Animal { void cry() {} }

class Bird extends Animal {
	@Override
	void cry() { System.out.println("짹짹");}
}

class Cat extends Animal {
	@Override
	void cry() {System.out.println("야옹");}
}

class Dog extends Animal {
	@Override
	void cry() {System.out.println("멍멍");}
}
