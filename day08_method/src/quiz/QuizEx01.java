package quiz;

public class QuizEx01 {
	public static void main(String[] args) {
		add(1,2);
		sub(1,2);
		message();
		max(-10,-55);
		
	}
	// max 함수
	public static void max(int i, int j) {
		int max = i;
		if(max < j) max = j;
		if(max > 0) System.out.println("max = "+max);
		else System.out.println("max가 음수입니다.");
	}
	
	// add 함수 (인자 2개)
	public static void add(int i, int j) {
		System.out.println("add = "+i+j);
	}
	
	// sub 함수 
	public static void sub(int i, int j) {
		System.out.println("sub = "+(i-j));
		
	}
	//message() {sysout}
	public static void message() {
		System.out.println("Hello");
	}
}
