
//*
package ex01.operator;

public class MainEntry {

	// 최단산쉬 관논삼대콤
	public static void main(String[] args) {
		// 산술연산자 : +, -, *, /, %, ^
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println(gob);
		System.out.println("x * y = "+(x*y));
		System.out.println(x+" * "+y+" = "+(x*y));
		System.out.println("---------------");
		
		System.out.println("3+4*5 = "+(3+4*5));
		System.out.println("(3+4)*5 = "+((3+4)*5));

		// 정수 (+, -, *, /, %, ^) 정수는 무조건 정수다
		// 정수 연산 정수 = 정수
		System.out.println("\n\n7/3 = "+(7 / 3)); //몫
 		System.out.println("7 % 3 = "+(7 % 3));	  //나머지
 		System.out.println();
 		
 	    // 정수 (+, -, *, /, %, ^) 정수는 무조건 정수다
		System.out.println("\n7 / 3 = "+(7/3));     //2
		System.out.println("\n7 / 3.0 = "+(7/3.0)); //2.3333
		System.out.println("\n7. / 3.0 = "+(7./3.0)); //2.3333


	}
}
//*/

/*
package ex01.operator;

public class MainEntry {

	// 최단산쉬관논삼대콤
	public static void main(String[] args) {
		
		//단항 연산자 : 증감 연산자 -> ++, --, ~
		
		int x = 10, y;
		// 10 == 01010
		// ~10 == 0101
		
		y = ~x; // 비트 부정 : -(원래값 + 1) ==> 출력 결과
		
		System.out.println("x = "+x+"\ty = "+y);
		
	}
}
//*/

/*
package ex01.operator;

public class MainEntry {

	// 최단산쉬관논삼대콤
	public static void main(String[] args) {
		//최우선 연산자 (), [], .
		
		//단항 연산자 : 증감 연산자 -> ++, --, ~
		
		int x = 10, y;
		//y = x++; // 후위연산 : 대입먼저, 연산 나중에
		//y = ++x;   // 전위연산 : 연산먼저, 대입 나중에
		
		x++; //++x;
		y = x;
		System.out.println("x = "+x+"\ty = "+y);
		
		
	}
}
*/
