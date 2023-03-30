package quiz;

import java.util.Scanner;

public class Quiz_ExceptionTryMultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, result;
		
		try {
			System.out.println("두 수를 입력하세요 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			result = a/b;
			System.out.println("결과 : "+result);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
