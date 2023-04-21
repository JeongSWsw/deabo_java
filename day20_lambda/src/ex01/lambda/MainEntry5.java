package ex01.lambda;

// 타입을 써야할 상황이 있다.
interface Message {
	void something(int x, int y); // parameter O
}
interface Talk{
	void something(String x, String y);
}

class Person {
	public void greeting(Message msg) {
		msg.something(3, 5);
	}
	public void greeting(Talk msg) {
		msg.something("Hello ", "deabo");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {
		// lambda Expression, JDK 1.8 이상
		Person p = new Person();


		System.out.println("-------------------------");

		System.out.println();

//		p.greeting((x, y) -> { // 에러발생, 타입에 대해서 애매해서 타입을 정확히 써줘야함
//		p.greeting((int x, int y) -> { // lambda 형태, 자료형 안써도됨, 괄호도 안써도 됨
		char ch = 'K';
		p.greeting((String x, String y) -> { // lambda 형태, 자료형 안써도됨, 괄호도 안써도 됨

			System.out.println("x = "+x+"y = "+y);
//			ch = 'P'; // lambda 안쪽에서는, 값 변경 할 수 없다.
			System.out.println(ch); // 출력은 가능
			num = 500; // lambda 안쪽에서, static 변수값은 변경 가능
			System.out.println(num);
			
		});
	}
	static int num = 30;

	
}
