package quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {

	// 사칙연산 함수
	// plus(+), mul(*) : 리턴 타입 없이
	// sub(-), div(/) : 리턴 타입 O, 나누기 예외처리
	
	public static void plus(int x, int y) {
		System.out.println("x + y = "+ (x+y));
	}
	
	public static void mul(int x, int y) {
		System.out.println("x * y = "+x*y);
	}
	
	public static int sub(int x, int y) {
		int sub = x - y;
		return sub;
	}
	public static double div(double x, double y) {
		double div = 0.;
		try {
			div = x / y ;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return div;
		
	}
	
	public static void main(String[] args) {
		System.out.print("두 수를 입력하세요 : ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		plus(x,y);
		mul(x,y);
		System.out.println("x - y = "+sub(x,y));
		System.out.println("x / y = "+div(x,y));
		
		
		
	}
}
