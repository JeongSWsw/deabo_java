package ex01.RandomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {

		Random rand = new Random();
		
		System.out.println(rand.nextDouble());
		int num = rand.nextInt();
		
		System.out.println(num);
		
		System.out.println("-----------------------");
		
		// rand.nextInt(n); // 0 ~ n-1 값 추출함
		System.out.println(rand.nextInt(5)); // 0~4까지 추출
		System.out.println(rand.nextInt(5)+1); // 1~5까지 추출
	}
}
