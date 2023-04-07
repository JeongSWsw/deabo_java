package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(3);
		p.setY(5);
		p.display();
		
		p.setXY(3, 5);
		p.display();
		
		Rectangle rt = new Rectangle();
		
		rt.setX1(1); rt.setX2(2); rt.setY1(3); rt.setY2(4);
		rt.display();
	}
}
