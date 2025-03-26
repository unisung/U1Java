package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx {
	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<Integer>();//capacity=10
		List<Integer> aList2 = new ArrayList<Integer>(30);//capacity=30
		Vector<String> aList3 = new Vector<String>(); //capacity=10
		//List<MyWork> aList4 = new LinkedList<MyWork>(20); //
		
		//방법2.
		List<Integer> asList1 = Arrays.asList(1,2,3,4);
		asList1.set(1, 7);
		//asList1.add(5);
		//asList1.remove(0);
	}
}
class MyWork{}