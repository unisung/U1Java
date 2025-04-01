package ch08;

import java.io.File;
import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("생성할 파일명을 경로같이 입력하세요>");
		String fileName = scanner.nextLine();//next()-한 토큰씩읽기, nextLine()-한줄씩 읽기'\n'제거
		File file = new File(fileName);
		if(!file.exists()) file.createNewFile();
	}
}
