package ch01;

public class ShiftExam {
	public static void main(String[] args) {
		System.out.println(5<<2);
		System.out.println(0b00000101<<2);
		//부호비트 유지
		System.out.println(5>>2);
		System.out.println(0b00000101>>2);
		//부호비트 유지
		System.out.println(-5>>2);
		System.out.println((byte)0b11111011>>2);
		//무조건 0으로 채움
		System.out.println(0xffffffff>>>31);
		
		String a = new String("안녕");
		String b = new String("안녕");
		System.out.println(a==b);
		
		//내용은 같고
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		//heap의 주소는 다름
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		//내용은 동등성 비교(equivalence)
		System.out.println(a.equals(b));

	}
}
