package homework;

import java.util.Scanner;

public class QuizEx03 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		String str = sc.next();
		int[] arr = new int[30];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextInt();
	}
}
