
//*
package ex02.datatype;

public class DataType2 {
	// 모든 자료형은 자신의 범위(크기)를 안벗어난다.
	public static void main(String[] args) {
		short sh = 32767; // -32,768 ~ 32,767
		int num = 50000; // -21억 ~ 21억
		
		// 작은 자료형을 큰 자료형으로 대입할때 자동형변환(묵시적형변환) 된다.
		num = sh; // int (4byte) = short (2byte)
		System.out.println(sh + " : "+ num);
		
		//num = -32769;
		num = 32770;
		// 큰 자료형을 작은 자료형으로 대입할때 명시적형변환 필요
		// 데이터 손실 발생
		sh = (short)num; // 명시적 형변환, short(2byte) = int(4byte)
		System.out.println(sh + " : " + num);
		
		
		
	}
} 
//*/


/* 
package ex02.datatype;

public class DataType2 {
	// 모든 자료형은 자신의 범위(크기)를 안벗어난다.
	public static void main(String[] args) {
		short sh = 32767; // -32,768 ~ 32,767
		int num = 50000; // -21억 ~ 21억
		
		System.out.println(sh + " : "+ num);
		
		//num = -32769;
		num = 32770;
		sh = (short)num; // 명시적 형변환
		System.out.println(sh + " : " + num);
		
		
		
	}
}
//*/

// 한줄 주석
/* 여러줄 주석 */