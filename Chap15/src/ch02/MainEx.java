package ch02;

public class MainEx {
	public static void main(String[] args) {
		//#1. 일반쓰레드
		  Thread thread1 = new MyThread();
		  thread1.setDaemon(false);
		  thread1.setName("thread1");
		  thread1.start();

		//#2. 데몬쓰레드
		  Thread thread2 = new MyThread();
		  thread2.setDaemon(true);
		  thread2.setName("thread2");
		  thread2.start();
		  
		//#3. 3초후 MainThread 종료
		  try { Thread.sleep(3000); } 
		  catch (InterruptedException e) {}
		  System.out.println("main thread 종료");

	}
}
