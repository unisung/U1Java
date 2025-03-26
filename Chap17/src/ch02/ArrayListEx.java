package ch02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx {
	public static void main(String[] args) {
		//List<Integer> aList = new ArrayList<>();
		//List<Integer> aList = new Vector();
		List<Integer> aList = Collections.synchronizedList(new LinkedList<Integer>());
		
		//#1. add(E element)
		aList.add(3);//기본타입 int 3 -> Integer(3) 
		aList.add(new Integer(4));
		aList.add(Integer.valueOf(5));
		System.out.println(aList);//toString()자동 호출
		
		//#2 add(int index, E element)
		aList.add(1,6);
		System.out.println(aList);//toString()자동 호출
		
		
		//#3. addAll(Collection<? extends E> c)
//		List<Integer> aList2 = new ArrayList<Integer>();
		//List<Integer> aList2 = new Vector<>();
		List<Integer> aList2 = new LinkedList<Integer>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList);//append & merge
		System.out.println(aList2);
		
		//#4. addAll(int index, Collection<? extends E> c)
		//List<Integer> aList3 = new ArrayList<Integer>();
		//List<Integer> aList3 = new Vector<Integer>();
		List<Integer> aList3 = new LinkedList<Integer>();
		aList3.add(1);
		aList3.add(2); //[1,2]
		aList3.addAll(1,aList3); // [1,[1,2],2] -> [1,1,2,2]
		System.out.println(aList3);
		
		//#5. set(int index, E element)
		aList3.set(1, 5); //set(index,객체)
		aList3.set(3, 6); 
		//aList3.set(4, 7); //index범위를 벗어나면 오류- add로
		System.out.println(aList3);
		
		//데이터 삭제
		aList3.remove(1);//인데스번호
		System.out.println(aList3);
		
		//#7. remove(Object o)
		//aList3.remove(2);//
		aList3.remove(new Integer(2));//인데스번호와 기본타입병행시,new 객체로 지정
		System.out.println(aList3);
		
		//#8. clear()
		aList3.clear();
		
		////#9. isEmpty();
        System.out.println(aList3.isEmpty()?"비었음":"요소가 남아있음");
        
        //#10. size()
        System.out.println(aList3.size());//저장된 객체의 수
        
        //## 11 특정 인덱스 위치의 요소 추출
        aList3.add(1); //index 0
        aList3.add(2); //index 1
        aList3.add(3); //index 2
        int result = aList3.get(1);
        System.out.println(result);
        
      //#12. toArray()
        Object[] objs = aList3.toArray();
       // System.out.println(objs);
        for(Object o:objs) System.out.println(o);
        
      //#13-1. toArray(T[] t)
       Integer[] integer1 = aList3.toArray(new Integer[0]);
       for(int i:integer1) System.out.println(i);
 
     //#13-2. toArray(T[] t)
       Integer[] integer2 = aList3.toArray(new Integer[5]);
       for(Object i:integer2) 
    	   if(i !=null)
    	    System.out.println(i); 
	}

}
