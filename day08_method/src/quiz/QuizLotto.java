package quiz;

import java.util.Random;

public class QuizLotto {
	public static void main(String[] args) {
		init();
	}
	
	//init
	public static void init() {
		int[] arr = new int[6];
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(45)+1;
			if(isCheck(arr,i)) {
				i--;
			}
		}
		
		for(int item : arr) {
			System.out.print(item+"\t");
		}
		
	}
	
	
	//isCheck(int[] arr, int i) { } 
	public static boolean isCheck(int[] arr, int i) {
		boolean flag = false;
		
		for(int j = 0 ; j < i; j++) {
			if(arr[j]==arr[i]) flag = true;
		}
		
		return flag;
	}
}
