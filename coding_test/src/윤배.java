
import java.io.FileInputStream;
import java.util.Scanner;

public class 윤배 {
	static int N = 10;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("./src/input.txt")); //파일로 처리 
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			char[][] board = new char[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = sc.next().charAt(0);
				}
			}
			System.out.println("#" + test_case + " " + solution(board, N));
		}
	}

	static int solution(char[][] board, int len) {
		int row = 0, col = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (board[i][j] == 'X') {
					row = i;
					col = j;
				}
			}
		}
		int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } }; //변경 좌표값 
		int result = 0;
		for (int[] dir : dirs) {
			int nextRow = row + dir[0];
			int nextCol = col + dir[1];
			while (inBoard(nextRow, nextCol, len) && board[nextRow][nextCol] == 'H') {
				result++;
				nextRow += dir[0];
				nextCol += dir[1];
			}
		}
		return result;
	}

	static boolean inBoard(int row, int col, int len) {
		return row >= 0 && row < len && col >= 0 && col < len;
	}

}
