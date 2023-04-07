package ex03.inheritance;

public class MainEntry {
	public static void main(String[] args) {
//		Point pt = new Point();
//		pt.display();
//	
//		
//		Point pt2 = new Point(100,300);
//		pt2.display();
//		
		Circle c= new Circle();
		c.display();
		
		System.out.println("----------------------");
		
		Circle c2 = new Circle(1,2);
		c2.display();

		System.out.println("----------------------");
		
		Rectangle rec1 = new Rectangle();
		rec1.display();
	}
}
