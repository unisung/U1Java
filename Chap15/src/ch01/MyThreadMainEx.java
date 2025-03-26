package ch01;

public class MyThreadMainEx {
	public static void main(String[] args) {
		System.out.print("코어수:");
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		//1. default 우선순위 - 생성시-5
		for(int i=0;i<3;i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try { Thread.sleep(1000); } 
		  catch (InterruptedException e) {}
		
		//2. 우선순위 설정
		for(int i=0;i<10;i++) {
			Thread thread = new MyThread();
			thread.setName(i+" 번째 쓰레드");
			if(i==9) {
				thread.setPriority(Thread.MAX_PRIORITY);//10 - JVM이 실행
				thread.start();
			}
		}
	}
}
