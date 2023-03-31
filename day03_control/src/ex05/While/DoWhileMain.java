
package ex05.While;

public class DoWhileMain {
	public static void main(String[] args) {


		int a = 1, b = 1;
		do {
			b=1; // 다중 whlie, do~while 문에서는 안쪽에 있는 변수의 초기화
			do {
				
				System.out.print(b+"\t");
				b++;

			}while(b <= 3);
			System.out.println();
			a++;
			
		} while(a <= 2);
				
	}
}

/*
package ex05.While;

public class DoWhileMain {
	public static void main(String[] args) {

		int a = 12;
		
		do {
			System.out.print(a+" ");
			a++; // 증감식
			
		}while(a < 11); // 문장종결기호
		
	}
}
//*/