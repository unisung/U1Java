package ch03;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetCase3Ex {
	public static void main(String[] args) {
	 Set<C> hashSet3 = new HashSet<C>();
	 
	 C c1 = new C(3);
	 C c2 = new C(3);
	 System.out.println(c1==c2);
	 System.out.println(c1.equals(c2));
	 System.out.println(c1.hashCode() + " "+c2.hashCode());
	 
	 hashSet3.add(c1);
	 hashSet3.add(c2);
	 System.out.println(hashSet3.size());
	 System.out.println(hashSet3);
	 
	}
}
class C{
	int data;
	public C(int data) {	this.data = data; }
	
	
	//hashCode재정의 - 1
	@Override
	public int hashCode() {
		return data;//키역할을 하는 필드를 hash코드로 사용
	}
	//equals()재정의 - 2
	@Override
	public boolean equals(Object obj) {
		return data == ((C)obj).data;
	}
}
