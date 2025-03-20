package ch02;

public class StockMain {
	public static void main(String[] args){
		Stock stock1 = new Stock("8801112", "새우깡", 100);
		System.out.println("현재고:"+stock1.balance);
		
		stock1.inStock(50);
		System.out.println("현재고:"+stock1.balance);
		
		try {
		stock1.withDraw(300);
		System.out.println("현재고:"+stock1.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
