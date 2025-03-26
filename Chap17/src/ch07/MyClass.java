package ch07;

public class MyClass implements Comparable<MyClass>{
  int data1;
  int data2;
public MyClass(int data1, int data2) {
	this.data1 = data1;
	this.data2 = data2;
}
@Override
public int compareTo(MyClass o) {
	return data1 - o.data1 > 0 ? 1: data1 - o.data1 < 0 ?-1:0 ;
}

}
