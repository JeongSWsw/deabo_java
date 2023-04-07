package quiz03;

public class PartTime extends Employee {

	private int partTimePayment;

	private int unitPrice = 5;

	public PartTime(int num, String name, String department, String phoneNum,int day) {
		super(num, name, department, phoneNum);
		if (day > 20) {
			this.partTimePayment = day * unitPrice;
		}
	}

	public int getPartTimePayment() {
		return partTimePayment;
	}

	public void setPartTimePayment(int partTimePayment) {
		this.partTimePayment = partTimePayment;
	}

	public void display() {
		super.display();
		System.out.println("partTimePayment : " + getPartTimePayment());
	}

}
