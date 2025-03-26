package ch03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
	Set<String> hSet1 = new HashSet<>(); // =
	//#1. add(E element)
	hSet1.add("가"); // O
	hSet1.add("나");
	hSet1.add("가"); // X 
	System.out.println(hSet1.toString()); //[가, 나]

	//#2. addAll(Collection<? extends E> c)
    Set<String> hSet2 = new HashSet<String>();
    hSet2.add("나");
    hSet2.add("다"); //[나,다]
    hSet2.addAll(hSet1);// [나,다,[가,나]] => [나,다,가,나] => [가,나,다]
	System.out.println(hSet2);
	
	//#3. remove(Object o)
	hSet2.remove("나");
	System.out.println(hSet2.toString()); //[가, 다]
	
	//#4. clear()
	hSet2.clear();
	System.out.println(hSet2.toString()); //[]
	
	//-데이터 정보 추출
	System.out.println(hSet2.isEmpty()?"비어있음":"요소가 남아있음");
	
	//#6. contains(Object o)
    Set<String> hSet3 = new HashSet<String>();
    hSet3.add("가");
    hSet3.add("나");
    hSet3.add("다");
    System.out.println(hSet3.contains("나")?"\"나\"가 있음":"\"나\"가 없음");
    
  //#7. size()
    System.out.println(hSet3.size()); //3
    
  //#8. iterator()
  Iterator<String> iterator = hSet3.iterator();//디자인패턴 - Factory
  while(iterator.hasNext()) {
	   System.out.print(iterator.next() + " ");
  }
  System.out.println();

   //#9. toArray()
	Object[] objArray = hSet3.toArray();
	System.out.println(Arrays.toString(objArray)); // [가 다 나]


	//#10-1. toArray(T[] t)
	String[] strArray1 = hSet3.toArray(new String[0]);
	System.out.println(Arrays.toString(strArray1)); //[가 다 나]

	//#10-2. toArray(T[] t)
	String[] strArray2 = hSet3.toArray(new String[5]);
	System.out.println(Arrays.toString(strArray2)); //[가 다 나 null null]
	
	}
}
