package ch01;

public class Human {
	String name;
	int age;
	
	void eat() {}
	void sleep(){}
	
	public static void main(String[] args) {
		//#1. Human 객체 (필드2개, 메서드2개)
		  Human h = new Human();
		  h.name="홍길동";
		  h.age=16;
		  h.eat();
		  h.sleep();

		  //#2. Student 객체 (필드 2+1개, 메서드 2+1개)
		  Student s = new Student();
		  s.name="김민성";
		  s.age=15;
		  s.studentID=128;
		  s.eat();
		  s.sleep();
		  s.goToSchool();

		  //#3. Worker 객체 (필드 2+1개, 메서드 2+1개)
		  Worker w = new Worker();
		  w.name="김현지";
		  w.age=30;
		  w.workerID=128;
		  w.eat();
		  w.sleep();
		  w.goToWork();

	}
}
class Student extends Human{
	int studentID;
	void goToSchool() {}
}
class Worker extends Human{
	int workerID;
	void goToWork() {}
}
