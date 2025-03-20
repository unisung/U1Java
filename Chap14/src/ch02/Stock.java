package ch02;

public class Stock {
	//필드
	String itemNo;
	String itemName;
	int balance;
	//생성자
	public Stock() {}
	public Stock(String itemNo, String itemName, int balance) {
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.balance = balance;
	}
	//getter/setter
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//재고 저장
	void inStock(int amount) {
		balance +=amount;
	}
	//재고 추출
	void withDraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("현재고:"+balance+",추출수량:"+amount+"재고가 모자랍니다.");
		}
		balance -= amount;
	}
	
	
	

}
