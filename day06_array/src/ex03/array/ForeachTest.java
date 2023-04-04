package ex03.array;

public class ForeachTest {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,100,88,99};
		
		System.out.println("오름차순 출력");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		System.out.println("\n내림차순 출력");
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]+"\t");
		}
		
		System.out.println();
		// for( 자료형 변수명 : 컬렉션명 또는 배열명 )
		for (int item : a) {
			System.out.print(item+"\t");
		}
	}
}
