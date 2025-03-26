package ch09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		//#1. 예외 처리 미포함 메서드
		Queue<Integer> queue1 = new LinkedList<Integer>();
		try {
		System.out.println(queue1.element());
		}catch(Exception e) {System.out.println(e.getMessage()+"객체에 접근해서 오류 발생");}

		//@1-1. 1-2. add(E item)  4 5 3
		queue1.add(3);  System.out.println(queue1.element()); //3
		queue1.add(5);  System.out.println(queue1.element()); // 5 3
		queue1.add(4);  System.out.println(queue1.element()); // 4 5 3
		
		//@1-3. remove()
		System.out.println(queue1.remove()); System.out.println(queue1.element()); // 4 5 3
		System.out.println(queue1.remove()); System.out.println(queue1.element()); // 4 5
		System.out.println(queue1.remove()); //System.out.println(queue1.element()); // 4
		
		//@2-1. 예외 처리 있는 메소드
		Queue<Integer> queue2 = new LinkedList<Integer>();
		System.out.println(queue2.peek());
		
		//@2-2. offer(E item)
		queue2.offer(3);  System.out.println(queue2.peek()); //3
		queue2.offer(5);  System.out.println(queue2.peek()); // 5 3
		queue2.offer(4);  System.out.println(queue2.peek()); // 4 5 3
		
		//@2-3. poll()
		queue2.poll();  System.out.println(queue2.peek()); // 4 5 3
		queue2.poll();  System.out.println(queue2.peek()); // 4 5
		queue2.poll();  System.out.println(queue2.peek()); // 4 
	}
}
