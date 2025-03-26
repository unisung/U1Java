package ch01;

public class MultiThreadEx {
	public static void main(String[] args) {
		
		//SMIFileThread생성 실행
		Thread smiThread = new SMIFileThread(); 
		//start()로 JVM에 호출 요청 
		smiThread.start();
		
		// (비디오프레임번호) 1~5 저장
		int[] intArray = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < intArray.length; i++) {// (비디오프레임번호) 1~5 출력
			System.out.println("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
