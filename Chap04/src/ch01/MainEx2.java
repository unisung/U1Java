package ch01;

public class MainEx2 {
	public static void main(String[] args) {
	 FishBread fb1 = new FishBread();
	 FishBread fb2 = new FishBread();
	 FishBread fb3 = new FishBread();
	 FishBread fb4 = new FishBread();
	 
     B b = new B();
     System.out.println(b.m);
     b.work1();
     System.out.println(b.s);
     System.out.println(b.d);
	}
}

class B{
	int m;
	int n;
	String s;
	double d;
	void work1() {
		int k;
		//System.out.println(k);
		System.out.println(m);
	}
}