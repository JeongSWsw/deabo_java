package quiz;

public class QuizEx01_1 {
	public static void main(String[] args) {
		int su = 12345;
		
		int hour, min, sec;
		
		hour = 12345 / (60*60);
		su = 12345 % (60*60);
		min = su / 60;
		sec = su % 60;
		
		System.out.println(hour+" : "+min+" : "+sec);
		
	}
}
