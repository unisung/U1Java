package ch01;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsListEx {
	public static void main(String[] args) {
		//배열
		String[] array
		= {"가","나","다","라","마","바","사"};
		System.out.println(array.length);
		//일부 삭제
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);
		
		//리스트
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size());
		aList.add("가");
		System.out.println(aList.size());
		aList.add("나");
		System.out.println(aList.size());
		aList.add("다");
		System.out.println(aList.size());
		aList.add("라");
		System.out.println(aList.size());
		aList.add("마");
		System.out.println(aList.size());
		aList.add("바");
		System.out.println(aList.size());
		aList.add("사");
		System.out.println(aList.size());
		//제거
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size());
	}
}
