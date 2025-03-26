package ch09;

import java.util.Stack;

public class StackEX {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		//#1. push()
		stack.push(new Integer(2));
		stack.push(Integer.valueOf(5));
		stack.push(new Integer(3));
		stack.push(7); //  int - > Integer: auto-boxing		
		// 저장 갯수 size()
		System.out.println(stack.size());		
		// peek()
		System.out.println(stack.peek());		
		//search()
		System.out.println(stack.search(7));//위치값 1부터 아래로 1씩 증가
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(9) > -1?"해당요소가 들어있음"
				          :"해당요소는 들어있지 않음");// 해당 객체가 없으면 -1을 리턴		
		//데이타 꺼내기 
		//#4.  E pop()
		System.out.println(stack.peek());
		System.out.println(stack.pop());//
		System.out.println(stack.peek());
		System.out.println(stack.pop());//
		System.out.println(stack.peek());
		System.out.println(stack.pop());//
		System.out.println(stack.peek());
		System.out.println(stack.pop());//
		if( stack.isEmpty()) {
		 System.out.println("비어있음");//
		}else {
			System.out.println(stack.peek());//오류 발생-비어있는 stack접근
		}
	}
}
