
import java.util.Scanner;

public class 기석 {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		// System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스 3
		int x, y, h; // xy= 좌표값 h= 일반 포
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // 장기판 크기 8
			char[][] pan = new char[N][N]; // 장기판
			x = y = 0;
			for (int i = 0; i < pan.length; i++) { // 장기판 초기화 및 X좌표 기억
				for (int j = 0; j < pan[0].length; j++) {
					pan[i][j] = sc.next().charAt(0);
					if (pan[i][j] == 'X') {
						x = i;
						y = j;
					}
				}
			}

			// 행,열을 증감 시키면서 동서남북으로 탐색
			h = 0;
			AnswerN = 0;
			for (int i = x; i < pan.length; i++) { // 좌표기준 행 증가
				if (pan[i][y] == 'Y') {
					break;
				} else if (pan[i][y] == 'H') {
					h++;
				}
			}
			AnswerN += h / 2;

			h = 0;
			for (int i = x; i >= 0; i--) { // 좌표기준 행 감소
				if (pan[i][y] == 'Y') {
					break;
				} else if (pan[i][y] == 'H') {
					h++;
				}
			}
			AnswerN += h / 2;

			h = 0;
			for (int i = y; i < pan[0].length; i++) { // 좌표기준 열 증가
				if (pan[x][i] == 'Y') {
					break;
				} else if (pan[x][i] == 'H') {
					h++;
				}
			}
			AnswerN += h / 2;

			h = 0;
			for (int i = y; i >= 0; i--) { // 좌표기준 열 감소
				if (pan[x][i] == 'Y') {
					break;
				} else if (pan[x][i] == 'H') {
					h++;
				}
			}
			AnswerN += h / 2;

			System.out.println("#" + test_case + " " + AnswerN);
		}
	}

}
