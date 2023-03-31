package ex01.RandomMethod;

public class MainEntry {

	public static void main(String[] args) {
		System.out.println(Math.random());
//		Math.random() * n // <== 0 ~ n-1 값 추출
		
		System.out.println(Math.random() * 5); // 0 ~ 4 까지 추출
		System.out.println(Math.random() * 5 + 1); // 1 ~ 5 까지 추출
		System.out.println((int)(Math.random() * 5 + 1)); // 1 ~ 5 까지 정수형 추출
		System.out.println((int)(Math.random() * 100 + 1)); // 1 ~ 100 까지 정수형 추출
		
	}
}
