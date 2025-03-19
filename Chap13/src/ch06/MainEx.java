package ch06;

import ch06.Button.OnClickListener;

public class MainEx {
	public static void main(String[] args) {
	//음악버튼의 이벤트 핸들러 처리
	Button button1 = new Button();
    button1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("1. 음악재생");
		}});
    button1.click();
    
    button1.setOnClickListener(()->System.out.println("1. 음악재생") );
    button1.click();
    
    Button button2 = new Button();
    button2.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("2. 네이버 접속");
		}
	});
    button2.click();
    
    button2.setOnClickListener(()->System.out.println("2. 네이버 접속"));
    button2.click();
	}
}
