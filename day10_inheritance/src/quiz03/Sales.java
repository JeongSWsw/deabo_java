package quiz03;

public class Sales extends Regular {
	private int commission;

	
	
	public Sales(int num, String name, String department, String phoneNum, int commissionNum) {
		super(num, name, department, phoneNum);
		if(commissionNum>=10) {
			this.commission = 1;
		}
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	public void display() {
		super.display();
		System.out.println("commission : "+getCommission());

		
	}
}
