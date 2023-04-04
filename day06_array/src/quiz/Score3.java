//*
package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Score3 {
	public static void main(String[] args) {

		int SU = 4, NO = 3;
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[SU][NO + 1]; // 인원수, 과목수
		String[] name = new String[SU];
		double[] avg = new double[SU];
		char[] grade = new char[SU];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d 번째 학생 이름: ", i + 1);
			name[i] = sc.next();

			for (int j = 0; j < arr[0].length - 1; j++) {
				switch (j) {
				case 0:
					System.out.println("국어점수 입력: ");
					break;
				case 1:
					System.out.println("영어점수 입력: ");
					break;
				case 2:
					System.out.println("전산점수 입력: ");
					break;
				} // switch end
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j]; // 총점

				avg[i] = (double) arr[i][3] / NO;

				// 학점(평점_
				switch ((int) avg[i] / 10) {
				case 10:
				case 9:
					grade[i] = 'A';
					break;
				case 8:
					grade[i] = 'B';
					break;
				case 7:
					grade[i] = 'C';
					break;
				case 6:
					grade[i] = 'D';
					break;
				default:
					grade[i] = 'F';
				}// switch end

			} // j end

		} // i end
			// out put

		double[] scorePan = Arrays.copyOf(avg, SU);
		Arrays.sort(scorePan);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(name[i] + "님의 성적표");
			System.out.println("국어: " + arr[i][0] + "\t영어: " + arr[i][1] + "\t전산: " + arr[i][2]);
			System.out.printf("총점: %d 평균 : %.1f 평점(학점) : %c ", arr[i][3], avg[i], grade[i]);

			for (int j = 0; j < scorePan.length; j++) {
				if (scorePan[j] == avg[i]) {
					System.out.printf("석차(등수) : %d\n", SU - j);
				}
			}
			line();
		}

	}

	private static void line() {
		System.out.println("----------------------------");
	}
}
//*/