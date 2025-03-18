package ch09;

public interface InterA {
   void abc();
   default void bcd() {}
}
class A implements InterA{
	@Override
	public void abc() {	}
	@Override
	public void bcd() {	}
}

class F implements InterA{
	@Override
	public void abc() {	}
}