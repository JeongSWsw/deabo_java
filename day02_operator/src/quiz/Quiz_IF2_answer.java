package quiz;

import java.util.Scanner;

public class Quiz_IF2_answer {

	public static void main(String[] args) {
		System.out.print("kor = "); int kor = new Scanner(System.in).nextInt();
		System.out.print("eng = "); int eng = new Scanner(System.in).nextInt();
		System.out.print("com = "); int com = new Scanner(System.in).nextInt();
		double avg = (kor + eng + com) / 3.0;
		
		if(avg >= 60) {
			if(kor >= 40 && eng >= 40 && com >= 40) {
				System.out.printf("모든 과목이 40점 이상이며, 평균이 %.1f로 [합격]입니다.\n",avg);
				
			}
			else {
				System.out.printf("평균이 %.1f 이지만, ", avg);
				if( kor < 40 ) System.out.print("국어 "+ kor + "점");
				if( eng < 40 ) System.out.print("영어 "+ eng + "점");
				if( com < 40 ) System.out.print("전산 "+ com + "점");
			
				System.out.print("으로 [과락탈락] 입니다.");
			}
		}
		else {
			System.out.printf("평균이 %.1f로 [평균 미달 탈락] 입니다.\n", avg);
		}
	}
}
