package ex01.method;

import java.util.Scanner;

public class MethodEx1 {
	//	3) 매개변수 X, 리턴타입 O
	public static int show() {
		System.out.println("show() method");
		return 100;
	}
	
	public static int max() {
		System.out.print("x, y = ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
//		if(x < y) return y;
//		else return x;
		return x<y ? y : x;
	}
	

	public static void main(String[] args) {
		show(); // 함수호출
		System.out.println(show());
		int num = show();
		System.out.println(num);
		int show = show();
		System.out.println(show);
		int max = max();
		System.out.println("max = " + max);
	}

}
