package assignment02;

public class Assignment03 {
	public static void main(String[] args) {

		double sum = 0.;
		for (int i = 1; i <= 9 ; i++) {
			sum += ((double)i / (i+1));
//			System.out.printf("%d / %d = %f\n", i , i+1, (float)i/(i+1));
//			System.out.println("중간 sum : "+sum);
		}
System.out.printf("%.2f", sum);
	}
}
