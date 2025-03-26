package ch01;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(long i=0;i<100000000;i++) {
			System.out.println(getName()+" 우선순위:"+getPriority());
		}
	}
}
