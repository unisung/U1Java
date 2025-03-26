package ch02;

public interface MyInterface {
  public abstract void print();
}
class K implements MyInterface{
	@Override
	public void print() {
		System.out.println("구현체 K");
	}
}

class BB{
	public <T extends MyInterface>
	                void method1(T t) {
		t.print();
	}
}
