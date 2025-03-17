package ch01;

public class Bird extends Animal implements Run {
	Bird(){
		kind="새";
	}

	@Override
	public void run() {
		System.out.println("날다");
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println(bird.kind);
	}
}
