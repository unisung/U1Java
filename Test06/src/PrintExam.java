
public class PrintExam {
	public static void main(String[] args) {
	System.out.println("화면출력");//문자열 하나출력
	System.out.println("화면"+"출력"); //문자열 결합 출력
	System.out.println(3.8); //실수 출력 -> "3.8"
	System.out.println(3+5); // 정수  + 정수의 결과 인 8 출력 -> "8" 
	System.out.println("화면"+3); // "화면"+"3" -> "화면3"
	System.out.println("화면"+3+5); //"화면"+3-> "화면"+"3"->"화면3"+"5"->"화면35"
	System.out.println(3+5+"화면"); //3+5-> 8, 8+"화면" -> "8"+"화면" -> "8화면"
//한줄 출력 print()
	System.out.print("화면");
	System.out.print("출력");
	System.out.print(3);
	System.out.println();
	
	//포멧 출력
	System.out.printf("%d\n",30); //
	System.out.printf("%o\n",30); // 3*8^1 + 6*8^0 = 30 
	System.out.printf("%x\n",30); // 1*16^1 + 14 = 30

	System.out.printf("%s\n","출력"); //
	System.out.printf("%f\n",5.8); // 
	System.out.printf("%4.2f\n",5.8567); // 
	System.out.printf("%d와 %4.2f\n",4, 	5.8543); // 

	}
}
