//*
package ex03.array;

import java.util.Scanner;

public class Score3 {

	public static void main(String[] args) {

		int INWON = 3;
		Scanner sc = new Scanner(System.in);
		String[] message = new String[] { "no : ", "name : ", "kor : " };
		int[] num = new int[INWON];
		int[] kor = new int[INWON];
		int[] eng = new int[INWON];
		int[] math = new int[INWON];
		int[] total = new int[INWON];
		double[] avg = new double[INWON];
		String[] name = new String[INWON];
		char[] grade = new char[INWON];
		double avgall = 0.;
		int totalall = 0;

		for (int i = 0; i < INWON; i++) {
			System.out.print("번호입력 : ");
			num[i] = sc.nextInt();
			System.out.print("이름입력 : ");
			name[i] = sc.next();
			System.out.print("국어입력 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어입력 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학입력 : ");
			math[i] = sc.nextInt();

			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = (total[i] / 3.);
			totalall += total[i];
			avgall = (double) totalall / INWON;

			switch (((int) avg[i]) / 10) {
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

			} // end switch

		} // end for
		for (int i = 0; i < INWON; i++) {
			System.out.println("==========================");
			System.out.println("번호 : " + num[i] + "\n이름 : " + name[i] + "님의 성적표******\n 총 점 : " + total[i]);
			System.out.println("==========================");
		} // end for
		System.out.println("==========================");
		System.out.printf("학급총점 : " + totalall + "\n학급평점 : %.2f", avgall);
		System.out.println("==========================");

	}

}
//*/