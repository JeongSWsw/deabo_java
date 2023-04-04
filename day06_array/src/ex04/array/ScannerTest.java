package ex04.array;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// next() vs nextLine()
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		sc.nextLine(); // 공백처리
		
		String b = sc.next();
		System.out.println(a+", "+b);
		
//		System.out.println(name + ", "+str);
		
		
	}
}
