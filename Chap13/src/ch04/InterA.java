package ch04;

public interface InterA {
	public abstract void bcd();
}
class B implements InterA{
	@Override
	public void bcd() {
		System.out.println("B");
	}
}

class C{
	void cde(InterA a) { //InterA , B
		a.bcd();
	}
}