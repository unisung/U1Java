package ch01;

public class CharExam {
	public static void main(String[] args) {
		char a = 'A'; //대문자 1개
		char b = '\u0042'; //유니코드에 해당하는 문자 1개 
		char c = '1'; //문자 '1'
		char d = 97; //int 97 -> char 97 
		char e = 0xac00; // 16^3*10 + 12^2*16+0+0

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
}
