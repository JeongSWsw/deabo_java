package quiz3;

public class Score implements Comparable<Score>{
	private String name;
	private int kor;
	private int eng;
	private int com;
	private int total;
	private char grade;
	private double avg;
	private int rank;
	
	@Override
	public int compareTo(Score o) {
		if(this.avg<o.avg) {
			return 1;
		}else if(this.avg>o.avg) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public Score(String name, int kor, int eng, int com) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.total = kor + eng + com;
		this.avg = total / 3.0;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			this.grade = 'A';
			break;
		case 8:
			this.grade = 'B';
			break;
		case 7:
			this.grade = 'C';
			break;
		case 6:
			this.grade = 'D';
			break;
		default:
			this.grade = 'F';
		}// switch end

	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", com=" + com + ", total=" + total
				+ ", grade=" + grade + ", avg=" + avg + ", rank=" + rank + "]\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
}
