package ex05.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8};
		
		int temp;
		
		System.out.println("Sort 전 출력 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}// if end
			}// j end
		}// i end
		
		System.out.println("\n\nSort 후 출력 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}
}
