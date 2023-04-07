package ex05.constructor;

public class Point {
	private int x, y;

	
	
	

	public Point() {
		this(100, 100);
		System.out.println("default constructor");
//		x = y = 100;
	}

	public Point(int x) {
		this(x,9999);
		System.out.println("1 constructor");
//		this.x = x;
//		y = 9999;
	}

	public Point(int x, int y) {
		System.out.println("2 constructor");
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void display() {
		System.out.println(x+", "+y);
	}
}
