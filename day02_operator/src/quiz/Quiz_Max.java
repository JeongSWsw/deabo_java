package quiz;

import java.util.Scanner;

public class Quiz_Max {
	public static void main(String[] args) {
		System.out.print("두 수를 입력하세요 : ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		int max = (a>b) ? a : b ;
		System.out.println("Max값 : "+max);
		
	}
}
