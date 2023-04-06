package ex03.overload;

import java.util.Iterator;

public class MainEntry {
	
	public static void line() {
		System.out.println("----------------------------");
	}
	public static void line(int n,String str) {
		// array : length 필드 <- 배열의 길이(크기)
		// String : length 함수 <- 문자열의 길이
		for(int i = 0; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	public static void line(int n, int y, String str) {
		if(n>y) { //교환
			int temp = n;
			n = y;
			y = temp;
		}
		for(int i = n ; i < y; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		line(10,"*");
		plus(12.34);
		line(20, "A");
		plus(20);
		line();
		plus("hello");
		line();
		
	}

	private static void plus(int x) {
		System.out.println(x + 100);
	}
	private static void plus(int x, int y) {
		System.out.println(x + y);
	}
	private static void plus(double x) {
		System.out.println(x + 100);
	}
	private static void plus(String x) {
		System.out.println(x + 100);
	}
}
