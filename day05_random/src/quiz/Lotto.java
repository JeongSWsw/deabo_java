package quiz;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		// 1 ~ 45 범위의 수를 -> 6개 추출
		// 중복 숫자 제거
		Random rand = new Random();
		int[] number = new int[6];
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 6; j++) {
				number[j] = rand.nextInt(45) + 1;

				// 중복 체크 start
				// for (int k = 0; k < 6; k++) {
				for (int l = 0; l < j; l++) {
					if (number[j] == number[l]) {
						do {
							number[j] = rand.nextInt(45) + 1;
						} while (number[j] == number[l]);
					}
					// }
				}
				// 중복 체크 end
				System.out.print(number[j] + " ");

			} // j end // 6개 숫자 출력
			System.out.println();
		} // i end // 5개 출력
	}
}
