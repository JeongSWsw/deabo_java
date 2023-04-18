
import java.util.Scanner;
class Solution {
	static int N, xs, ys;
	static char[][] map;
	static int calc(int x, int y, int flag) {
		int ret = 0;
		
		boolean chk = false;
		
		switch (flag) {
			case 0:
				while (x > 0) {
					x--;
					if (map[y][x] == 'Y') break;
					
					if (map[y][x] == 'H') {
						if (chk) {
							ret++;
							chk = false;
						}
						else chk = true;
					}
					else chk = false;
				}
				break;
			case 1:
				while (x < N - 1) {
					x++;
					if (map[y][x] == 'Y') break;
					
					if (map[y][x] == 'H') {
						if (chk) {
							ret++;
							chk = false;
						}
						else chk = true;
					}
					else chk = false;
				}
				break;
			case 2:
				while (y > 0) {
					y--;
					if (map[y][x] == 'Y') break;
					
					if (map[y][x] == 'H') {
						if (chk) {
							ret++;
							chk = false;
						}
						else chk = true;
					}
					else chk = false;
				}
				break;
			case 3:
				while (y < N - 1) {
					y++;
					if (map[y][x] == 'Y') break;
					
					if (map[y][x] == 'H') {
						if (chk) {
							ret++;
							chk = false;
						}
						else chk = true;
					}
					else chk = false;
				}
				break;
		}
		
		return ret; 
	}
	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new char[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
					if (map[i][j] == 'X') {
						xs = j;
						ys = i;
					}
				}
			}
			int ans = 0;
			for (int i = 0; i < 4; i++) ans += calc(xs, ys, i);
			System.out.println("#"+test_case+" "+ans);
		}
	}
}
