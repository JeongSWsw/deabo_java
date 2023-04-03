//*
package ex02.array;

public class QuizEx1 {

	public static void main(String[] args) {
		
		int[] arr = {7,8,9,10,11,12,13,14,15};
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) continue;
			System.out.println("a["+i+"] = "+arr[i]);
		}
		
		
	}
}
//*/



/*
package ex02.array;

import java.util.Random;

public class QuizEx1 {

	public static void main(String[] args) {
		// 배열 여러개 데이터 중에서 7의 개수를 찾기
		Random rand = new Random();
		int[] arr = new int[7];
		int seek = rand.nextInt(10)+1;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10)+1;
			if(seek == arr[i]) cnt++;
		}
		
		System.out.println(seek+"의 개수 : "+cnt);
		System.out.print("배열 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length-1) {
				System.out.print(", ");
			}
		}
	}
}
//*/


/*
package ex02.array;

public class QuizEx1 {

	public static void main(String[] args) {
		// 배열 여러개 데이터 중에서 7의 개수를 찾기
		
		int seek = 7;
		int[] arr = new int[] {7,3,7,8,1,9,7,100,12,7,33,7};
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(seek == arr[i]) {
				cnt++;
			}
		}
		System.out.println("7의 개수 : "+cnt);
	}
}
//*/

/*
package ex02.array;

public class QuizEx1 {

	public static void main(String[] args) {
		// 배열 5개 데이터 선언
		// 합 구하기
		
		int sum = 0;
		int[] arr = new int[] {3,5,8,1,9};
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총합 : "+sum);
	}
}
//*/