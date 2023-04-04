package ex03.array;

import java.util.Scanner;

public class QuizEx4 {
	public static void main(String[] args) {
		
		//int[][] a = {{1,2,0},{5,7,0}};
		int[][] a = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length-1; j++) {
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < a.length; i++) {
			a[i][2] = a[i][0] * a[i][1];
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
