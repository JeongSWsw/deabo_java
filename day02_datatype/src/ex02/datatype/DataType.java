package ex02.datatype;

public class DataType {
	public static void main(String[] args) {
		String str = "A"; //문자열, " ", 2byte
		char ch = 'A'; 	  //문자, ' ', 1byte
		char ch2 = 67;
		char ch3 = 'b';
		int su = 20; String nickname = "happy"; double d = 12.34;
		
		System.out.println(ch); // A
		System.out.println(str);// A
		System.out.println((int)ch); //ASCII
		System.out.println(ch2 + ch3); // ?
		System.out.println("nickname = " + nickname);
		System.out.println("실수형 데이터 : "+ d);
		
		for(int i = 65; i <= 90; i++) {
			System.out.print( (char)i + " "); // \t : tab key
		} //end for
		
		System.out.println("\n\n-------------------------------------------");
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print( (char)i + " "); // \t : tab key
		} //end for
		
		System.out.println("\n\nboolean type");
		boolean Flag = true; // error : boolean -> int 로 형변환 불가능
		// System.out.println(flag); 
		
		

		
	}
}
