package ch03;

public class Test {
 void method1(Goods<A> g) {}
 void method2(Goods<?> g) {}
 void method3(Goods<? extends B> g) {}
 void method4(Goods<? super B> g) {}
 
 
 public static void main(String[] args) {
	 Test t = new Test();

	  //#1. Case1. method1(Goods<A> g)
	  t.method1(new Goods<A>()); //O
	  //t.method1(new Goods<B>()); //X
	 // t.method1(new Goods<C>()); //X
	 // t.method1(new Goods<D>()); //X

	  //#2. Case2. method2(Goods<?> g)
	  t.method2(new Goods<A>()); //O
	  t.method2(new Goods<B>()); //O 
	  t.method2(new Goods<C>()); //O 
	  t.method2(new Goods<D>()); //O 

	  //#3. Case3. method3(Goods<? extends B> g)
	  //t.method3(new Goods<A>()); //X
	  t.method3(new Goods<B>()); //O
	  t.method3(new Goods<C>()); //O
	  t.method3(new Goods<D>()); //O

	  //#4. Case4. method4(Goods<? super B> g)
	  t.method4(new Goods<A>()); //O
	  t.method4(new Goods<B>()); //O
	  //t.method4(new Goods<C>()); //X
	  //t.method4(new Goods<D>()); //X

}
}
