package ch02;

//제네릭클래스
public class D<T extends B> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
//일반클래스
class  A{}
class  B extends A{}
class  C extends B{}