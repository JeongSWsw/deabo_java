package quiz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
	public static void input(ArrayList<Score> scores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름,국어점수,영어점수,전산점수를 입력하세요 : ");
		Score score = new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		scores.add(score);
	}

	public static void listScores(ArrayList<Score> scores) {
		Collections.sort(scores);
		for(int i = 0; i< scores.size();i++) {
			setRank(scores, scores.get(i));
		}
		System.out.println(scores);
	}

	public static void removeScore(ArrayList<Score> scores, Integer i) {
		scores.remove(i);
		Collections.sort(scores);

	}

	public static void updateCustomer(ArrayList<Score> scores, Integer i, Score score) {
		scores.set(i, score);
		Collections.sort(scores);

	}
	
	public static void setRank(ArrayList<Score> scores,Score score) {
		int rank = scores.indexOf(score);
		score.setRank(rank+1);
	}

}
