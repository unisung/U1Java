package ch04;

public class MainEx {
	public static void main(String[] args) {
		//#1. 부모제네릭 클래스
		  Parent<String> p = new Parent<>();
		  p.setT("부모제네릭클래스");
		  System.out.println(p.getT());

		  //#2. 자식1 제네릭 클래스
		  Child1<String> c1 = new Child1<>();
		  c1.setT("자식1 제네릭클래스");
		  System.out.println(c1.getT());

		  //#3. 자식2 제네릭 클래스
		  Child2<String, Integer> c2 = new Child2<>();
		  c2.setT("자식2 제네릭클래스");
		  c2.setV(100);
		  System.out.println(c2.getT());
		  System.out.println(c2.getV());

	}

}
