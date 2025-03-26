package ch08;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEX02 {
	public static void main(String[] args) {
        TreeMap<MyClass, String> treeMap = new TreeMap<>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				return o1.data1 - o2.data1 >0 ? 1: o1.data1 - o2.data1 <0? -1:0 ;
			}
		});
        treeMap.put(new MyClass(2, 5), "홍길동");
        treeMap.put(new MyClass(3, 3), "일지매");
        
         for(MyClass mc: treeMap.keySet()) {
       	  System.out.println(treeMap.get(mc));
         }
        
	}
}
