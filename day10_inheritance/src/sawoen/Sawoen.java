package sawoen;

public class Sawoen {
	private int num;
	private String name;
	private String jobGrade;
	private String department;
	private int payment;
	private String cellphone;

	// getter / setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobGrade() {
		return jobGrade;
	}
	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	public Sawoen() {
		this(0, "", "", "", 0, "");
	}
	
	public Sawoen(int num, String name, String jobGrade){
		this(num,name,jobGrade,"",0,"");
//		this.num = num;
//		this.name = name;
//		this.jobGrade = jobGrade;
	}
	public Sawoen(int num, String name, String jobGrade, String department, int payment, String cellphone) {
		super();
		this.num = num;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.payment = payment;
		this.cellphone = cellphone;
	}
	
	public void display() {
		System.out.println(num+", "+name+", "+jobGrade+", "+department+", "+payment+", "+cellphone);
	}
	
	
}
