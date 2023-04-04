//*
package ex04.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int[] a = new int[30];
		int[][] a2 = new int[2][3]; // 초기화 되어 있지 않을 때는 행, 열 크기 생략 할 수 없다.
		int[][] a3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] a4 = { { 1, 2, 3 }, { 4, 5, 6 } };
//		int[][] a5 = {1,2,3,4,5,6}; //error
//		int[][] a6 = new int[2][] {{1,2,3},{4,5,6}}; //error
		int[][] a7 = { { 0, }, { 0, } }; // {{0},{0}}; (,안찍어도됨)

		int[][][] a8 = new int[5][2][3]; // [면][행][열]

		// 배열 길이(크기)
		System.out.println("1차원 배열 길이 : " + a.length); // 30
		System.out.println("2차원 배열 행길이 : " + a2.length); // 30
		System.out.println("2차원 배열 열길이 : " + a2[0].length); // 30
		System.out.println();
		System.out.println("3차원 배열 면길이 : " + a8.length);
		System.out.println("3차원 배열 행길이 : " + a8[0].length);
		System.out.println("3차원 배열 열길이 : " + a8[0][0].length);

		// 임의적인 데이터 입력 받아서 배열 데이터값 출력하는프로그램 작성

		int[][][] arr = new int[2][2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				for (int k = 0; k < arr[0][0].length; k++) {
					System.out.printf("arr[%d][%d][%d] = ",i,j,k);
					arr[i][j][k] = new Scanner(System.in).nextInt();
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				for (int k = 0; k < arr[0][0].length; k++) {
					System.out.print(arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
//*/

/*
 * package ex04.array;
 * 
 * public class MainEntry { public static void main(String[] args) { int[] arr =
 * new int[100]; for (int i = 0; i < arr.length; i++) { //arr[i] = 5 * (i + 1);
 * arr[i] = (int)(Math.random()*100)+2; } for (int i = 0; i < arr.length; i++) {
 * System.out.print(arr[i] + "\t"); if ((i + 1) % 10 == 0) {
 * System.out.println(); } } } } //
 */