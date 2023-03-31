package quiz;

public class QuizGuGuDan_While {
	public static void main(String[] args) {

		int i = 1, j = 2;

		while (i < 10) {
			j = 2;
			while (j < 10) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				j++;
			}
			System.out.println();
			i++;

		}
	}
}
