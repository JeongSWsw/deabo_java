package quiz;

import java.util.Scanner;

public class Quiz_윤년판정 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		boolean flag = false;
		if(year % 4 == 0) {
			if( year % 400 != 0 || year % 100 == 0) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다");
		}
		
	}
}
