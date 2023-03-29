package ex02.scanner;

import java.util.Scanner;
// ctrl + shift + O

// 한줄주석 설정, 해제 : ctrl + / 
// 여러줄주석 설정 : ctrl + shift + /
// 여러줄주석 해제 : ctrl + shift + \

public class MainEntry {

	public static void main(String[] args) {

		// 표준 입력 : System.in
		// 표준 출력 : System.out

		
		  Scanner sc = new Scanner(System.in); // 객체 생성, 메모리 할당, 생성자함수자동호출
		  System.out.print("정수 데이터 입력 요망 : "); int su = sc.nextInt();
		  
		  System.out.println("\n\n입력 받은 수 : "+su);
		 
		// nextXXX()
		// 자료형
		// nextInt()
		// nextFloat()
		// nextDouble()
		// next() vs nextLine() <- String input method

		// java.io <- Input / Output
		// java.util <- Scanner, JDK 5부터 도입됨

	}
}
