package ch03;

public class Goods<T> {
	private T t;
	public T get() {
	    return t;
	  }
	public void set(T t) {
	    this.t = t;
	  }
}
class A{}
class B extends A{}
class C extends B{}
class D extends C{}
