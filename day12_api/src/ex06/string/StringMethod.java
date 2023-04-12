package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "doyeon";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2);
		s2 = s2.replace("EO", "korea");
		System.out.println(s2);
		System.out.println("----------------------");
		s1 = s1+s2;
		System.out.println(s1);
		System.out.println("-----------------------");
		
		String s3 = new String("           ab         cd        " );
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim();
		System.out.println(s3);
		System.out.println(s3.length());
		System.out.println("-----------------------");
		
		String s4 = new String("ab/defgh/344553/sndlkf/32453");
//		String[] s5 = s4.split(" ");
		String[] s5 = s4.split("/");
		for(int i = 0; i < s5.length; i++) {
			System.out.println("분리된 "+i+"번 문자열 : "+s5[i]);
		}
		
		System.out.println("-----------------------");
		String s6 = "123-4567-8900";
		String[] s7 = s6.split("-");
		for(int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
		System.out.println("-----------------------");
		
		String s8 = "13124234ajdfsflk 49u549 034902 string";
		char ch = s8.charAt(8);
		System.out.println(ch);
		
		s8 = s8.substring(5, 7);
		System.out.println(s8);
		System.out.println("-----------------------");
		
		System.out.println("소문자로 출력 : "+s2.toLowerCase());
		System.out.println("대문자로 출력 : "+s1.toUpperCase());
		System.out.println(s2);
		System.out.println(s1);
		
		char[] ch2 = s1.toCharArray();
		for(int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]+"\t");
		}
	}
}
