package ch06;

public class Student {
  int sno;
  String name;
public Student(int sno, String name) {
	this.sno = sno;
	this.name = name;
}
@Override
public String toString() {
	return "Student [sno=" 
           + sno + ", name=" + name + "]";
}
//동등여부 hash코드값같고, equals()결과 true;
@Override
public int hashCode() {
	return this.sno;
}
@Override
public boolean equals(Object obj) {
	return ((Student)obj).sno==this.sno;
 }
}