package ex03.inheritance;

public class Rectangle extends Point{
	private int x2, y2;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int x) {
		super(x);
		this.x2 = x2;
	}

	public Rectangle(int x2, int y2) {
		super();
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void display() {
		super.display();
		System.out.println(x2+", "+y2);
	}
	
}
