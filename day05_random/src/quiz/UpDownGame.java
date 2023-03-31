package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {

		// 1~100 중에 난수 출력 dan = 난수값
		// 5번의 기회
		Random rand = new Random();
		int dan = rand.nextInt(100)+1;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("값을 입력하세요(1~100) : ");
			int userAns = new Scanner(System.in).nextInt();
			if(userAns < dan) {
				System.out.println("UP");
			}
			else if (userAns > dan) {
				System.out.println("DOWN");
			}
			else
			{
				System.out.println("정답입니다. 게임이 종료됩니다.");
				System.exit(0);
			}
		}
		System.out.println("기회 상실");
		System.out.println("정답은 "+ dan +"입니다.");
		
	}
}
