//*
package quiz;

public class QuizEx2 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//*/


/*
package quiz;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		System.out.print("원하는 구구단 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1 ; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num,i,num*i);
		}
	}
}
//*/

/*
package quiz;

public class QuizEx2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				if (i % 20 == 0) {
					System.out.println();
				}
			}
		}
	}
}
//*/