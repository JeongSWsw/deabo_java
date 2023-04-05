package quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {

	// 사칙연산 함수
	// plus(+), mul(*) : 리턴 타입 없이
	// sub(-), div(/) : 리턴 타입 O, 나누기 예외처리

	public static void plus(int x, int y) {
		System.out.println("x + y = " + (x + y));
	}

	public static void mul(int x, int y) {
		System.out.println("x * y = " + x * y);
	}

	public static int sub(int x, int y) {
		int sub = x - y;
		return sub;
	}

	public static double div(int x, int y) {
		double div = 0.;
		try {
			div = (double) x / y;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return div;

	}

	public static void main(String[] args) {

		while (true) {
			System.out.println("integer data input(1:+,2:/,3:*,0:exit) = ");
			int choice = new Scanner(System.in).nextInt();

			System.out.print("두 수를 입력하세요 : ");
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				plus(x, y);
				break;
			case 2:
				System.out.println("x / y = " + div(x, y));
				break;
			case 3:
				mul(x, y);
				break;
			case 0:
				System.out.println("종료를 원하시는군요. 잘가요~");
				System.exit(0);
			default:
				System.out.println("없는 번호 선택하셨습니다. 0 ~ 3중에 선택하세요.");
			}

		}

	}
}
