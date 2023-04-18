
import java.util.Scanner;
import java.io.FileInputStream;

class CodingTest01 {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		// System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			char[][] arr = new char[N][N];
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[0].length; k++) {
					arr[j][k] = sc.next().charAt(0);
				}
			} // arr 입력받기
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[0].length; k++) {
					if(arr[j][k] == 'X') {
						function(arr, j, k-1);
						function(arr, j-1, k);
						function(arr, j+1, k);
						function(arr, j, k+1);
					}
				}
			}
			
			System.out.println("#" + test_case + " " + AnswerN);
		} // test_ case end
	} //main end
	public static void function(char[][] arr, int x, int y) {
		if(arr[x][y] == 'Y') {
		}
		else if(arr[x][y] == 'L') {
		}
		else if(arr[x][y] == 'H') {
		}
//		else
			
	}
	
}
