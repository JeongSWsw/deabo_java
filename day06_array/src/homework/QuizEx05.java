package homework;

import java.util.Scanner;

public class QuizEx05 {
	public static void main(String[] args) {
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				//System.out.print("a[" + i + "][" + j + "] = ");
				//a[i][j] = sc.nextInt();
				a[i][j] = (int)(Math.random() * 100)+1;
			}
		}
		for (int i = 0; i < a[0].length; i++) {
			a[2][i] = a[1][i] + a[0][i];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}System.out.println();
		}

	}
}
