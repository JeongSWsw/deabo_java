package quiz;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com;
		char op = ' ';
		do {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();		
		} while ((kor < 0 || kor > 100) );
		do {
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();			
		} while ((eng < 0 || eng > 100) );
		do {
			System.out.print("전산 점수 : ");
			com = sc.nextInt();
		} while ((com < 0 || com > 100) );
		
		do {
			System.out.print("연산자 : ");
			op = sc.next().charAt(0);
		}while( (op != '+')&&(op != '-')&&(op != '*')&&(op != '/'));
	
		switch(op) {
		case '+' : System.out.printf("%d + %d + %d = %d",kor, eng, com, kor+eng+com); break;
		case '-' : System.out.printf("%d - %d - %d = %d",kor, eng, com, kor-eng-com); break;
		case '*' : System.out.printf("%d * %d * %d = %d",kor, eng, com, kor*eng*com); break;
		case '/' : System.out.printf("%d / %d / %d = %f",kor, eng, com, (float)kor/eng/com); break;
		}
	
	}
}
// 3과목 입력 받아서 (0~100) 점수만 입력 받는다.
// 연산자 (+,-, *,/)입력 받아서
// 결과