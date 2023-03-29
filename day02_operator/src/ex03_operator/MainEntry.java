//*
package ex03_operator;

import java.util.Scanner;

//최단산쉬관논삼대콤
public class MainEntry {

	public static void main(String[] args) {
		// 삼항(조건) 연산자 : ( 조건 ) ? (참) : (거짓);
		
		int x,y, z=0, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data 2 input : ");
		
		x = sc.nextInt(); y = sc.nextInt();
		
//		if(x > y) {
//			result = x;
//		}
//		else
//			result = y;
		
		result = (x > y) ? x : y;
		
		System.out.println("max = " + result);
		
		String str = null;
		System.out.println("year = ");
		int year = sc.nextInt();
		
		
		str = (year == 2000) ? "맞네" : "틀리네";
		
		System.out.println(year + "년도 : " + str);
		
		result = (x>y) ? x 
				: (y>z) ? y
						: (x > z) ? x : z;
	}
	
}
//*/


/*
package ex03_operator;

//최단산쉬관논삼대콤
public class MainEntry {

	public static void main(String[] args) {
		
		//논리연산자 : &, &&(and), |, ||(or), ^(xor), !(not) 
		
		int a = 4;
		int b = 7;
		
		// 2진 논리 결과 ==> 값
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		
		// 10진 논리 결과 ==> T/F (참,거짓)
		int x = 10, y = 20, z = 30;
		boolean flag = false;
		
//		flag = (x < y) && (y < z);
//		flag = (x > y) && (y < z); // '&&'연산일 때, 앞의 값이 거짓이면 뒤는 수행하지 않는다.
		
		flag = (x < y) || (y < z); // '||'연산일 때, 앞의 값이  참이면 뒤는 수행하지 않는다.
		
		
		System.out.println(flag);
		
		System.out.println(!flag);
		
		
		
	}
	
}
//*/