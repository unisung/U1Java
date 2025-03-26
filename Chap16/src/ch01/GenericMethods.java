package ch01;

//일반클래스
public class GenericMethods {
	//Generic 메소드
	public <T> T method1(T t) {
		return t;
	}
	//Generic 메소드
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	//Generic 메소드
	public <K,V> void mehtod3(K k, V v) {
		 System.out.println(k +" : ");
		 System.out.println(v);
	}
}
