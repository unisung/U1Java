package ch04;

public class MainEx01 {
	public static void main(String[] args) {
		Animal[] animals = { new Animal(), 
				new Bird(), new Cat(), 
				new Dog() };
		for (Animal ani : animals) {
			ani.cry();
		}

	}
}
