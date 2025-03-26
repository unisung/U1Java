package ch05;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
 public static void main(String[] args) {
  //TreeSet생성시 Comparator인터페이스를 매개변수로 저장
	 Set<MyClass> treeSet1
  = Collections.synchronizedSet( new TreeSet<MyClass>(new Comparator<MyClass>() {
		@Override
		public int compare(MyClass o1, MyClass o2) {
		  return (int)Math.signum(o1.data1 - o2.data1);
		}
	}));
	 
	 
	 
  MyClass myClass1 = new MyClass(2,5);
  MyClass myClass2 = new MyClass(3,3);
	 
	 treeSet1.add(myClass1);
	 treeSet1.add(myClass2);
	 
	 for(MyClass mc: treeSet1)
		 System.out.println(mc.data1);
	}
}
