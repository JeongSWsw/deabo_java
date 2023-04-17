package quiz4;

public class Worker extends Person {
	private String dept;
	private int payment;
	public Worker(String name, String phone, String dept, int payment) {
		super(name, phone);
		this.dept = dept;
		this.payment = payment;
	}
	
}
