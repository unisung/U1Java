package ch02;

public class MainEx01 {
	public static void main(String[] args) {
		BB b= new BB();
		b.method1(new K());
		
		b.method1(new MyInterface() {
			public void print(){
				System.out.println("무명인터페이스");	
			}
		  } 
		);
	//람다식
	   b.method1(()->System.out.println("무명인터페이스"));
	}
}
