package ch01;

public class SMIFileThread2 extends Parent implements Runnable {
	@Override
	public void run() {
		// (자막 번호) 하나~다섯 저장
		String[] strArray = new String[] { "하나", "둘", "셋", "넷", "다섯" };
		for (int i = 0; i < strArray.length; i++) {// (자막 번호) 하나~다섯 출력
				m1();	
			System.out.println("(자막) " + strArray[i]);
				m1();
				try {
						Thread.sleep(200);
				} catch (InterruptedException e) {}
		}
	}
}
