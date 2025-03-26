package ch04;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetRefEx01 {
	public static void main(String[] args) {
	 Set<MyClass> set1 = new HashSet<>();
	 MyClass c1 = new MyClass(2, 5);
	 MyClass c2 = new MyClass(3, 3);
	 set1.add(c1); set1.add(c2);
	 System.out.println(set1);
	 
	 TreeSet<MyClass> set2 = new TreeSet<>();
	 MyClass c11 = new MyClass(2, 5);
	 MyClass c22 = new MyClass(3, 3);
	 set2.add(c11); set2.add(c22);
	 System.out.println(set2);
	}
}
//객체를 Comparable인터페이스로 구현 - cmpareTo()메소드 재정의
class MyClass implements Comparable<MyClass>{
	int data1; //크기비교는 data1값 비교
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyClass m) {
		//return (int)Math.signum(data1 - m.data1);
		//return data1 - m.data1 > 0 ? 1: data1-m.data1<0?-1: 0;
		if (data1 < m.data1) return -1;
		else if( data1 == m.data1) return 0;
		else return 1;
	}
}