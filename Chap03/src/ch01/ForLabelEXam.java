package ch01;

public class ForLabelEXam {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3)
					break;
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("---------------");

		out: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3)
					break out;
				System.out.println(i + ", " + j);
			}
		}
	}
}
