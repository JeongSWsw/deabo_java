package ex02.datatype;

public class MainEntry {
	
	static int Num; // 정수형 : 0, 실수형 : 0.0, 문자열 : NULL
	static String str; 
	
	public static void main(String[] args) { // 시작점 (진입점)
		
		int y = 99; // 지역변수는 반드시 초기화 하고 사용한다.
		System.out.println(y); 
		
		System.out.println("static value : "+Num+","+str);
		int su = 30;
		System.out.println(su); // 4byte
		System.out.println(100); // 4byte
		
		long num = 20;
		System.out.println(num); // 8byte
		System.out.println(1000); // 4byte
		System.out.println(1000L); // 8byte long형
		
		double d = 12.34;
		System.out.println(d); //
		System.out.println(34.56); // double
		System.out.println(12.34f); // float
		
		float f = 12.34f; // f / F
		System.out.println(f);	
		
	} // main end
} // class end
