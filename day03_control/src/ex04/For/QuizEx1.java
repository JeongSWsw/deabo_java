//*
package ex04.For;

public class QuizEx1 {
	public static void main(String[] args) {
	
		int sum = 0, cnt = 0;
		for(int i = 1 ; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("1~100까지 3의 배수의 합 : "+sum+", 개수 : "+cnt);
	}
}
//*/


/*
package ex04.For;

public class QuizEx1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
//*/