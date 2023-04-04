package ex05.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8};
		
		int temp;
		
		System.out.println("Sort 전 출력 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		for(int i = 0; i < a.length; i++) { // 4
			for(int j = 0; j < a.length-i-1; j++) { // 4 - i - 1
				if (a[j] > a[j+1]) { // 교환 - 부등호 방향에 따라 오름/내림차순이됨 if(a[j]<a[j+1])
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}// if end
			}// j end
		}// i end
		
		System.out.println("\n\nSort 후 출력 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
	}
}
/*
기준이 없다. 
*/
 