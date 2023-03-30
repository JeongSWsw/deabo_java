package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {

	public static void main(String[] args) 
			throws ArithmeticException, InputMismatchException{ // 예외처리 위임

		int x, y, result;

		System.out.print("x, y = ");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		result = x / y; // 에러 발생할 수 있다.
		
		System.out.println(result);

	}
}
