package ch01;

public class SingleThreadEx {
	public static void main(String[] args) {
		// (비디오프레임번호) 1~5 저장
		int[] intArray = new int[] { 1, 2, 3, 4, 5 };
		// (자막 번호) 하나~다섯 저장
		String[] strArray = new String[] { "하나", "둘", "셋", "넷", "다섯" };

		for (int i = 0; i < intArray.length; i++) {// (비디오프레임번호) 1~5 출력
			System.out.println("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
		for (int i = 0; i < strArray.length; i++) {// (자막 번호) 하나~다섯 출력
			System.out.println("(자막) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}

	}
}
