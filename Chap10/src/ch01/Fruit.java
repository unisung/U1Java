package ch01;

public class Fruit {
	void kind() {
		System.out.println(this.getClass().getSimpleName()+"은(는) 과일이다.");
	}
}
class Apple extends Fruit{
	@Override
	void kind() { System.out.println(this.getClass().getSimpleName()+"은(는) 사과다.");
	}}
class Grape extends Fruit{

	@Override
	void kind() {
		System.out.println(this.getClass().getSimpleName()+"은(는) 포도다.");
	}}
class Kiwi extends Fruit{

	@Override
	void kind() {
		System.out.println(this.getClass().getSimpleName()+"은(는) 키위다.");
	}}
