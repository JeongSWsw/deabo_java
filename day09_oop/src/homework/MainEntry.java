package homework;


public class MainEntry {

	public static void main(String[] args) {
		TV tv = new TV(); // 객체생성, 메모리할당, 생성자함수자동호출
		tv.display();
		TV tv2 = new TV(25);
		tv2.display();
		
		TV tv3 = new TV("green");
		tv3.display();
		
		TV tv4 = new TV(99,"pink");
		tv4.display();
//		tv.setChannel(10);
//		tv.setColor("red");
//		tv.display();
	}
}
