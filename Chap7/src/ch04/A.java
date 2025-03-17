package ch04;

public class A {
	static String company="삼송";
	static int seq=0;
	String no;
	//static 초기화 블럭
	static { seq++; } // 0 -> 1
	//instance 초기화 블럭
	{ no = company + seq++; } // "삼송1", "삼송2", "삼송3"
	//생성자
	A(){
		System.out.println(no);
	}
	
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		A c = new A();
	}

}
