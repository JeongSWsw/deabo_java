package quiz03;

public class Employee {
	protected int num;
	protected String name;
	protected String department;
	protected String phoneNum;
	
	public Employee() {
		this(0,"","","");
	}
	
	public Employee(int num, String name, String department, String phoneNum) {
		this.num = num;
		this.name = name;
		this.department = department;
		this.phoneNum = phoneNum;
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void display() {
		System.out.println("num : "+getNum());
		System.out.println("name : "+getName());
		System.out.println("department : "+getDepartment());
		System.out.println("phoneNum : "+getPhoneNum());
	}
	
	
	
}
