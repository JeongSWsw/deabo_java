package quiz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import quiz.Customer;

public class View {
	public static void main(String[] args) {
		
		ArrayList<Score> scores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력하세요.");
			System.out.println("1. 학생점수추가 2. 삭제 3. 학생 출력 4. 수정 5.프로그램종료");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				Controller.input(scores);
				break;
			}
			case 2: {
				Controller.listScores(scores);
				System.out.println("삭제할 학생의 번호를 입력하세요.");
				Integer i = new Integer(sc.nextInt());
				Controller.removeScore(scores, i);
				break;
			}
			case 3: {
				Controller.listScores(scores);
				break;
			}
			case 4: {
				Controller.listScores(scores);

				System.out.print("수정할 학생의 번호를 입력하세요.");
				Integer i = new Integer(sc.nextInt());
				System.out.println("학생의 이름,국어점수,영어점수,전산점수를 입력하세요 : ");
				Score score = new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				Controller.updateCustomer(scores, i, score);
				break;
			}
			case 5: {
				System.exit(0);
			}
		
			}
		}
	}
}
