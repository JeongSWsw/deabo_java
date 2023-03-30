
//*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {


		int x, y, result;

		try {
			System.out.print("x, y = ");
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			result = x / y; // 에러 발생
			System.out.println(result);
		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다."); // user message
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
//*/
/*
 * package ex03.exception;
 * 
 * import java.util.Scanner;
 * 
 * public class MainEntry {
 * 
 * public static void main(String[] args) {
 * 
 * System.out.print("x, y = ");
 * 
 * int x, y, result ; x = new Scanner(System.in).nextInt(); y = new
 * Scanner(System.in).nextInt();
 * 
 * if( y == 0 ) { System.out.println("0으로 나눌 수 없습니다."); System.exit(0); }
 * 
 * 
 * result = x / y; // 에러 발생
 * 
 * 
 * System.out.println(result); } } //
 */