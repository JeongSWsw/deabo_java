package homework;

import java.util.Scanner;

public class QuizEx02 {
	public static void main(String[] args) {

		// 추가 ) 원하는 달(월) 입력받아서 일수 결정
		System.out.print("원하는 달을 입력하세요 : ");
//		int month
		
		
		
		int SU = 3;
		int sum = 0; // 유지보수 수월하게!
		double avg = 0;
		double[] arr = new double[SU];

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "일 강수량 입력 하세요.");
			arr[i] = new Scanner(System.in).nextDouble();
			sum += arr[i];
			avg = (double) sum / arr.length;
		}
		System.out.printf("4월 평균 강수량 : %.2f", avg);
	}
}
