package ch03;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i=50;i>0;i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		//1
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		//lower
		System.out.println(treeSet.lower(26));
		System.out.println(treeSet.higher(26));
		
		//floor, ceiling
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		
		//데이터 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		for(int i=0;i<treeSetSize;i++) {
			System.out.println(treeSet.pollFirst());
		}
		System.out.println(treeSet.size());
		
		//pollLast()
		for(int i=50;i>0;i-=2) {treeSet.add(i);}
		System.out.println(treeSet.size());
		for(int i=0;i<treeSetSize;i++) {
			System.out.print(treeSet.pollLast()+" ");
		}
		System.out.println();
		System.out.println(treeSet.size());
		
		//-데이터 부분집합(Subset) 생성
		for(int i=50;i>0;i-=2) {treeSet.add(i);}
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		//#10. NavigableSet<E> headSet(E toElement, boolean inclusive)
		NavigableSet<Integer> nSet = treeSet.headSet(20, false);
		System.out.print(nSet);
		nSet = treeSet.headSet(20, true);
		System.out.print(nSet);
		System.out.println();
		
		//#11. SortedSet<E> tailSet(E toElement)
		sSet = treeSet.tailSet(20);//20~50, 20시작, 끝50
		System.out.println(sSet);
		System.out.println();
		
		//#12. NavigableSet<E> tailSet(E toElement, boolean inclusive)
		nSet = treeSet.tailSet(20, false);//22,50
		System.out.print(nSet);
		System.out.println();
		
		nSet = treeSet.tailSet(20, true);//20,50
		System.out.print(nSet);
		System.out.println();
		
		//#13. SortedSet<E> subSet(E fromElement, E toElement)
        sSet = treeSet.subSet(10, 20);//10포함, 20미포함
        System.out.println(sSet);
		System.out.println();
		
		//#14. NavigableSet<E> subSet(E fromElement, boolean 
		//          frominclusive,E toElement, boolean toinclusive)
		nSet = treeSet.subSet(10, true, 20, false);//10,20
		System.out.print(nSet);
		System.out.println();
		nSet = treeSet.subSet(10, false, 20, true);//10,20
		System.out.print(nSet);
		System.out.println();
		
	}
}
