package ch01;

public class Goods<T extends Fruit> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

class Fruit{}
class Apple extends Fruit{}
class Strawberry extends Fruit{}