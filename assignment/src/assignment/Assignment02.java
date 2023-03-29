package assignment;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		System.out.print("첫번째 수 : ");
		int a = new Scanner(System.in).nextInt();
		System.out.print("두번째 수 : ");
		int b = new Scanner(System.in).nextInt();
		System.out.print("연산자 : ");
		String strop = new Scanner(System.in).next();
		char op = strop.charAt(0);
		
		if(op == '+') {
			System.out.println(a+" + "+b+" = "+ (a+b));
		}
		else if(op == '-') {
			System.out.println(a+" - "+b+" = "+ (a-b));
		}
		else if(op == '*') {
			System.out.println(a+" * "+b+" = "+ (a*b));
		}
		else if(op == '/') {
			System.out.println(a+" / "+b+" = "+ ((double)a/b));
		}
		
	}
}
