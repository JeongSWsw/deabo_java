package ex03.inheritance;

public class Circle extends Point{ // sub class
	private int r;
	// private int x, y; -> protected int x,y;
	
	
	public Circle() {
		this.r = 5;
		System.out.println("Circle default constructor");
	}
	
	public Circle(int x, int y) {
		super(x, y); // 반드시 첫줄에 있어야함
		this.r = 55;
		System.out.println("Circle x,y constructor");

	}

	public Circle(int r) {
		super();
		this.r = r;
		System.out.println("Circle r constructor");

	}

	public void display() {
		super.display(); 
		//Point pt = new Point();
		//pt.display();
		System.out.println(", "+r);
	}
}

