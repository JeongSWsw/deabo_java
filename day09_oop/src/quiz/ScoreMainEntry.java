package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreMainEntry {
	
	public static void main(String[] args) {

		int SU = 2;
		Score[] scoreArr = new Score[SU];
		
		input(scoreArr);
		cal(scoreArr);
		output(scoreArr);
	}

	public static void cal(Score[] scoreArr) {
		for(int i = 0; i < scoreArr.length; i++) {
			scoreArr[i].calTotal();
			scoreArr[i].calAvg();
			scoreArr[i].calGrade();
		}
	}
	
	public static void input(Score[] scoreArr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = new Score();
			System.out.printf("%d 번째 학생 이름: ", i + 1);
			scoreArr[i].setName(sc.next());
			System.out.println("국어점수 입력: ");
			scoreArr[i].setKor(sc.nextInt());
			System.out.println("영어점수 입력: ");
			scoreArr[i].setEng(sc.nextInt());
			System.out.println("전산점수 입력: ");
			scoreArr[i].setCom(sc.nextInt());

		} // for end
	} // input end

	public static void output(Score[] scoreArr) {
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println(scoreArr[i].getName() + "님의 성적표");
			System.out.println(
					"국어: " + scoreArr[i].getKor() + "\t영어: " + scoreArr[i].getEng() + "\t전산: " + scoreArr[i].getCom());
			System.out.printf("총점: %d 평균 : %.1f 평점(학점) : %c ", scoreArr[i].getTotal(), scoreArr[i].getAvg(), scoreArr[i].getGrade());

//			System.out.printf("석차(등수) : %d\n", SU - j);

		}
	}

}
