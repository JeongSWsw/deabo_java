package quiz;

public class QuizEx01 {

	public static void main(String[] args) {
		
		//1. 변수선언
		int pay = 567890;
		int man, chun, back, sip; //몫 저장 변수
		int m_na, ch_na, b_na;	  //나머지 저장변수
		
		//2. 메세지 출력 및 입력받기
		//3. 처리(계산)
		man = pay / 10000;
		m_na = pay % 10000;
		
		chun = m_na / 1000;
		ch_na = m_na % 1000;
		
		back = ch_na / 100;
		b_na = ch_na % 100;
		
		sip = b_na / 10;
		
		//4. 결과출력(화면)
		System.out.println("\n\n만원 : "+man
				+"장\n천원 : "+chun
				+"장\n백원 : "+back
				+"개\n십원 : "+sip
				+"개"
				);
		
		System.out.println("=====================");
		System.out.println("\n\n10000 : "+(pay / 10000)
				+"장\n 1000 : "+(pay % 10000)/1000
				+"장\n  100 : "+((pay%10000)%1000)/100
				+"개\n   10 : "+(((pay %10000)%1000)%100) / 10 
				+"개"
				);
		
		
		
		/*
		int pay = 567890;
		
		int a = pay / 10000;
		pay = pay % 10000;
		int b = pay / 1000;
		pay = pay % 1000;
		int c = pay / 100;
		pay = pay % 100;
		int d = pay / 10;
		pay = pay % 10;
		
		System.out.println("만원 : "+a+"장");
		System.out.println("천원 : "+b+"장");
		System.out.println("백원 : "+c+"개");
		System.out.println("십원 : "+d+"개");
		*/
	}
}
