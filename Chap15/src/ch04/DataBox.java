package ch04;

public class DataBox {
	boolean isEmpty = true;
	int data;

	synchronized void inputData(int data) throws InterruptedException {
		if (!isEmpty) {
			wait();
		}
		isEmpty = false;
		this.data = data;
		System.out.println("입력 데이터: " + data);
		notify();
	}

	synchronized void outputData() throws InterruptedException {
		if (isEmpty) {
			wait();
		}
		isEmpty = true;
		System.out.println("출력 데이터: " + data);
		notify();
	}

}
