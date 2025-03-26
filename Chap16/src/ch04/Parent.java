package ch04;

public class Parent<T> {
	T t;
	public T getT() {
	    return t;
	}
	public void setT(T t) {
	    this.t = t;
	}
}
class Child1<T> extends Parent<T>{}
class Child2<T,V> extends Parent<T>{
	V v;
	public V getV() {
	    return v;
	}
	public void setV(V v) {
	    this.v = v;
	}
}
