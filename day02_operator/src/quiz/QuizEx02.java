package quiz;

import java.util.Scanner;

public class QuizEx02 {

	public static void main(String[] args) {

		String name, address, phone;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		address = sc.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		phone = sc.nextLine();
		
		System.out.println("\n\n이름 : "+name
				+"\n주소 : "+address
				+"\n연락처 : "+phone);
		
	}
}
