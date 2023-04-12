package ex05.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "Hello";
		System.out.println("str : "+str);
		
		char data[] = {'a','b','c'};
		str = new String(data); //캐릭터 배열 -> 문자열로 변환
		System.out.println("str : "+str);
		System.out.println("kbs");

		String msg = "cdefghij";
		System.out.println("Korea "+msg);
		System.out.println(msg);
		
		msg = msg.concat(" korea"); // 문자열 결합
		System.out.println(msg);
		
		String str2 = "abcdef".substring(2);
		System.out.println(str2);
		
		str2 = "abcdef1234567890jwxy".substring(2,5); // 상한값 포함, 하한값 미포함
		System.out.println(str2);
		
		System.out.println(msg+" : "+str);
		
	}
}
