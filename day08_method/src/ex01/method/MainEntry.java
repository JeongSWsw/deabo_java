package ex01.method;

public class MainEntry {
//	2) 매개변수 O, 리턴타입 X
	public static void plus(int x, int y, String msg) { // 함수정의부(구현부)
		System.out.println("hap = " + (x + y));
		int sum = x + y;
		System.out.println("sum = " + sum);
		System.out.println(x + ", " + y + ", " + msg);
	}

	public static void main(String[] args) {
		abs(-9);
		plus(10, 20, "hello");// 함수호출
		System.out.println("main start");
		line();
		info();
		line();
		System.out.println("main end");

	}

	private static void abs(int x) { //private : 클래스 내부에서만 접근 가능
		if(x<0) { x = -x;}
		System.out.println("절댓값 : " + x);
	}

//	1) 매개변수 X, 리턴타입 X
	public static void info() {
		System.out.println("doyeon");
		System.out.println("010-9872-0202");
		System.out.println("seoul");
	}

	public static void line() {
		System.out.println("---------------------------");
	}

//	3) 매개변수 X, 리턴타입 O

//	4) 매개변수 O, 리턴타입 O
}
