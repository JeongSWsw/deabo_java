package quiz;

import java.util.Scanner;

public class Quiz_월의마지막일수 {

	public static void main(String[] args) {
		System.out.print("input month : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"월의 마지막 날은 31일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월의 마지막 날은 30일 입니다.");
			break;
		case 2:
		{
			System.out.print("연도를 입력하세요 : ");
			int year = sc.nextInt();
			boolean flag = false;
			if((year % 4 == 0) && (year % 400 != 0 || year % 100 == 0)) {
				flag = true;
			}
			if(flag) {
				System.out.println(month+"월의 마지막 날은 29일 입니다.");
			}
			else {
				System.out.println(month+"월의 마지막 날은 28일 입니다.");
			}
		}
		break;
		default:
			System.out.println("잘못 입력하셨습니다. 1~12 사이");
			break;
			
		} // switch end
	}
}
