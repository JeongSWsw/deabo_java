package ex05.constructor;

public class MainEntry {
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(10);
		Point p3 = new Point(10,15);
		
		Point pt = new Point();
		pt.display();
		
		System.out.println(pt.hashCode());
	
		System.out.println(p2.toString().hashCode());
		System.out.println(p3.toString().hashCode());
	}

}

