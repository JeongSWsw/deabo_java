package quiz03;

public class MainEntry {
	public static void main(String[] args) {
		Sales sales1 = new Sales(1, "정승원","개발팀","010-",20);
		sales1.display();
		
		line();
		
		PartTime partTime1 = new PartTime(2, "강","인사팀","010-",30);
		partTime1.display();
	}
	public static void line() {
		System.out.println("--------------------------");
	}
}
