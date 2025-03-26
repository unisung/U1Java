package ch04;

public class WaitAntNotifyEx {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		Thread t1 = new Thread() { //쓰기 쓰레드
			  @Override
			    public void run() {
			      for (int i = 0; i < 10; i++) {
			        try {
			          dataBox.inputData(i);
			        } catch (InterruptedException e) {}
			      }
			    }
			 };
			 
			 Thread t2 = new Thread() { //읽기 쓰레드
				    @Override
				    public void run() {
				      for (int i = 0; i < 10; i++) {
				        try {
				          dataBox.outputData();
				        } catch (InterruptedException e) {}
				      }
				    }
			};
			
			t1.start(); t2.start();

	}

}
