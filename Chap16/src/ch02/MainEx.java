package ch02;

public class MainEx {
	public static void main(String[] args) {
	 //D<A> d1 = new D<>();
	 D<B> d2 = new D<>();
	 D<C> d3 = new D<>();
	 
	 d2.set(new B() );
	 d2.set(new C() );
	 
	 //d3.set(new B() );
	 d3.set(new C() );
	}
}
