package ch06;

import java.util.HashSet;
import java.util.Set;

public class MainEx02 {
public static void main(String[] args) {
	Student student1 = new Student(1, "홍길동");
	Student student2 = new Student(2, "일지매");
	Student student3 = new Student(1, "홍길동");
	
	Set<Student> students = new HashSet<Student>();
	students.add(student1);
	students.add(student2);
	students.add(student3);
	
	System.out.println(students);
	
	
 }
}
