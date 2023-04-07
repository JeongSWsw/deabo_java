package quiz03;

public class Regular extends Employee {
	private int payment;
	//switch ~ case 문 -> 급여

	
	
	public Regular(int num, String name, String department, String phoneNum) {
		super(num, name, department, phoneNum);
		switch(department) {
		case "영업팀":
			this.payment = 250;
			break;
		case "인사팀":
			this.payment = 300;
			break;
		case "개발팀":
			this.payment = 350;
			break;
		default :
			this.payment = 200;
		}
		
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	public void display() {
		super.display();
		System.out.println("payment : "+getPayment());
	}
	
	
}
