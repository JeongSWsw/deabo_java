package quiz;

import java.util.Scanner;

public class TeamQuiz_2 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 0 && score <= 100) {
			
			switch(score / 15) {
			
			case 7,6,5:
				System.out.println("상"); break;
			
			case 4:
				System.out.println("보통"); break;
		
			default :
				System.out.println("노력"); break;
			}	
			
		}
		else
			System.out.println("잘못된 점수를 입력하셨습니다.");
	}
}
