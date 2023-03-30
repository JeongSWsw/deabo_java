package quiz;

import java.util.Scanner;

public class Quiz_IF2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 컴퓨터 점수를 입력하세요 : ");
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int comScore = sc.nextInt();
		
		double avg = (korScore + engScore + comScore) / 3.0;
		
		if(avg >= 60 && korScore >= 40 && engScore >= 40 && comScore >= 40) {
			System.out.println("합격, 평균 : "+avg);
		}
		else if(korScore >= 40 && engScore >= 40 && comScore >= 40) {
			System.out.println("평균 점수 미달로 인한 불합격");
		
		}
		else if(korScore < 40) {
			System.out.println("국어 과락으로 인한 불합격, 평균 : "+avg);
		}
		else if(engScore < 40) {
			System.out.println("영어 과락으로 인한 불합격, 평균 : "+avg);
		}
		else
			System.out.println("컴퓨터 과락으로 인한 불합격, 평균 : "+avg);
	}
}
