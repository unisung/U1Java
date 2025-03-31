package ch09;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {
	public static void main(String[] args) {
		List list = new ArrayList(); //<> 이 없는 구조
		list.add("hello"); // String -> Object
		list.add(5);  // int -> Integer -> Object
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i)); // Object -> String/Integer
		
		//배열
		int[] arr = new int[10]; // [0][0][10][0][0][0][0][0][0][0] 크기 고정
		System.out.println(arr.length);
		arr[2] = 10;
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
		System.out.println();
		//arr.length = 20;  길이 수정 불가
		String[] arr2 = new String[5];// [null][null]["hello"][null][null] 크기 고정
		arr2[2] = "hello";
		for(int i=0;i<arr2.length;i++) System.out.print(arr2[i]+" ");
		System.out.println();
		//arr2 저장
		for(int i=0;i<arr2.length;i++) arr2[i]="hi";
		for(int i=0;i<arr2.length;i++) System.out.print(arr2[i]+" ");
		System.out.println();
		//저장된 객체의 길이
		for(int i=0;i<arr2.length;i++) System.out.print(arr2[i].length()+" ");
		System.out.println();
		
		//삭제
		arr2[2] = null; //["hi"]["hi"][null]["hi"]["hi"] // 5고정
		//저장된 객체의 길이
		for(int i=0;i<arr2.length;i++) System.out.print(arr2[i].length()+" ");
		   System.out.println();
		
		
		
		
		
	}
}
