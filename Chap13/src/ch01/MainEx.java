package ch01;

public class MainEx {
	public static void main(String[] args) {
		//바깥쪽 클래스 객체 생성
		A a = new A();
		//바깥쪽.안쪽타입 b = 바깥쪽참조변수.new 안쪽();
		A.B b = a.new B();
		//안쪽 클래스의 맴버(메소드)에 접근
		b.bcd();
	}

}
