package ch05;

public class Parent {
  public <T> void print(T t) {
	  System.out.println(t);
  }
}

class Child extends Parent{}