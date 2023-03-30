package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		int x, y, result;

		try {
			System.out.print("x, y = ");
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			result = x / y; // 에러 발생
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			System.out.println("Exception");
		} // try end
	}
}
