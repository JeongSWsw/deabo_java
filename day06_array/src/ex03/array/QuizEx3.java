package ex03.array;

public class QuizEx3 {
	public static void main(String[] args) {
		int[][] a = new int[][] { { 3, 8, 5, 10 }, 
			{ 7, 1, 2, 3 }, 
			{ 0, 0, 0, 0 } };

		for (int j = 0; j < a[0].length; j++) {
			a[2][j] = a[0][j] + a[1][j];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}

	}
}
