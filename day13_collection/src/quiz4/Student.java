package quiz4;

public class Student extends Person {
	
	private int classNum;
	private int score;
	public Student(String name, String phone,int classNum, int score) {
		super(name,  phone);
		this.classNum = classNum;
		this.score = score;
	}
	
	
}
