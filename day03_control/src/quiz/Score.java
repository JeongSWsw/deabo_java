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
		int sum; double avg;
		sum = (korScore+engScore+comScore);
		avg = sum / 3.0;
		
		char grade;
		switch((int)avg / 10) {
		case 10: case 9: grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		case 5: case 4: case 3: case 2: case 1: case 0: grade = 'F'; break;
		default : grade = ' '; System.out.println("잘못된 평균이 산출되었습니다."); System.exit(0);
		}
		
		System.out.println(name + "님의 성적표************");
		System.out.println("국어 : "+korScore
				+", 영어 : "+engScore
				+", 전산 : "+comScore);
		
		
		System.out.println("총점 : "+sum
				+", 평균 : "+avg
				+", 평점(학점) : "+grade);
	
		
	
	}
}
