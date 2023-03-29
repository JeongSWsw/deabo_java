package quiz;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("국어, 영어, 전산 점수를 입력하세요 : ");
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int comScore = sc.nextInt();
		
		System.out.println(name + "님의 성적표************");
		System.out.println("국어 : "+korScore+", 영어 : "+engScore+", 전산 : "+comScore);
		
		
		System.out.println("총점 : "+(korScore+engScore+comScore)+", 평균 : "+(korScore+engScore+comScore)/3.0);
	}
}
