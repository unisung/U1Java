package ch07;

import java.util.TreeMap;

public class TreeMapEx02 {
	public static void main(String[] args) {
     TreeMap<MyClass, String> treeMap = new TreeMap<>();
     treeMap.put(new MyClass(2, 5), "홍길동");
     treeMap.put(new MyClass(3, 3), "일지매");
     
      for(MyClass mc: treeMap.keySet()) {
    	  System.out.println(treeMap.get(mc));
      }
	}
}
