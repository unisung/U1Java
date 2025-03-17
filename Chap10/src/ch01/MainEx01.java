package ch01;

public class MainEx01 {
	public static void main(String[] args) {
	 Fruit fruit = new Fruit();  fruit.kind();
	 Apple apple = new Apple();  apple.kind();
	 Grape grape = new Grape();  grape.kind();
	 Kiwi kiwi = new Kiwi();  kiwi.kind();
	 //promotion subclass -> superclass (형변환)
	 Fruit[] fruits = {new Apple(), //Apple() -> Fruit()
			           new Grape(), //Grape() -> Fruit()
			           new Kiwi()}; //Kiwi()  -> Fruit()

	 for(Fruit f:fruits) {f.kind();}
	}
}
