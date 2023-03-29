package ex02.datatype;

public class DataType3 {
	// 진법
	public static void main(String[] args) {
		int su = 10;
		System.out.println("10진수 : " + su);
		
		System.out.printf("10진수 : %d\n", su);
		
		System.out.printf(" 8진수 : %o\n", su);

		System.out.printf("16진수 : %x  %X\n", su, su);

		System.out.printf("%d %x %o %X\n", su, su, 10, 10);
		
		// 0 숫자 -> 8진수, 0x숫자 -> 16진수, 
		System.out.printf("%d\n", 012); // 012(8진수) -> 10진수 출력
		
		System.out.printf("%d\n", 0xA); // 0xA(16진수) -> 10진수 출력
		
		System.out.println("--------------------------------");
		
		double f = 12.34;
		System.out.println(f);
		float ff = 5.6f;
		System.out.println(ff);


		
	}
	
}
