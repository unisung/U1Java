package ch03;

public class MyThread extends Thread {
	@Override
	public void run() {
	    try { Thread.sleep(3000); } 
	    catch (InterruptedException e) {
	      System.out.println(" --sleep() 중 interrupt 발생--");
	      for(long i=0; i<100000000L; i++) {} //시간지연
	    }
	}
}
