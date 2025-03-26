package ch03;

public class MyThread1 extends Thread {
	@Override
	  public void run() {
	    for(long i=0; i<1000000000L; i++) { }
	  }
}

class MyThread2 extends Thread{
	MyThread1 myThread1;

	public MyThread2(MyThread1 myThread1) {
	    this.myThread1=myThread1;
	 }

	@Override
	public void run() {
     try {
    	 myThread1.join(3000);
     }catch(Exception e) {
    	 System.out.println("---join() 중 interrup 발생 ---");
     }
     for(long i=0;i<100000000L;i++) {}
		
	}
}
