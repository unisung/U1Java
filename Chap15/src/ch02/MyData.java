package ch02;

public class MyData {
	int data = 3;
      //1. 메소드 동기화
	 // public synchronized void plusData() {
	 // 2. 블럭 동기화
	 public void plusData() {
		 synchronized (this) {
			 //데이터를 바로 가져와 2초 뒤 결과값 저장
			 int mydata = data; 
			 try { Thread.sleep(2000); 
			 } catch (InterruptedException e) {}
			 data=mydata+1;
		}
   }
}
