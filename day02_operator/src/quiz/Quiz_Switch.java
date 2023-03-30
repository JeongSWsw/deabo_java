package quiz;

import java.util.Scanner;

public class Quiz_Switch {

	public static void main(String[] args) {
		System.out.print("당신이 받은 점수는? ");
		int jumsu = new Scanner(System.in).nextInt();
		
		switch (jumsu / 10) {
		case 9 : System.out.print("A"); break;
		case 8 : System.out.print("B"); break;
		case 7 : System.out.print("C"); break;
		case 6 : System.out.print("D"); break;
		case 5 :
		case 4 :
		case 3 :
		case 2 :
		case 1 :
		case 0 :
			System.out.print("F"); break;
		default : System.out.println("점수를 잘못 입력하셨습니다."); System.exit(0);
		
		} // switch end
		System.out.println("학점 입니다.");
	}
}
