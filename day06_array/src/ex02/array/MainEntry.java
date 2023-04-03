package ex02.array;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열생성, 메모리에 할당
		
		// 2.
		char[] ch2 = new char[4]; // 배열선언 및 생성
		// 배열 초기화
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		// 3.
		// 선언과 동시에 초기화
		char[] ch3 = {'J', 'A', 'V', 'A', 'k', 'b'};
	
		// 배열의 길이 (크기)
		System.out.println("ch2 배열의 길이 (크기) : "+ ch2.length);
		System.out.println("ch3 배열의 길이 (크기) : "+ ch3.length);
		
		// 배열의 내용 출력
		System.out.println("ch[2] = "+ch[2]);
		System.out.println("=====================");
		for(int i = 0; i < 4; i++) {
			System.out.println("ch["+i+"] = "+ch2[i]);
		}
		for(int i = 0; i < ch3.length; i++) { // 배열의 길이를 구하는 필드 length 이용함
			System.out.println("ch3["+i+"] = "+ch3[i]);
		}
		
	}
}
