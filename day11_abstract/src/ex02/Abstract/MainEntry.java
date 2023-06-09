package ex02.Abstract;


public class MainEntry {
	public static void main(String[] args) {
		System.out.println("==========================");
		// 1. 각자의 클래스로 객체 생성 형태
		Circle c = new Circle();
		c.show("원");
		
		Rect r = new Rect();
		r.show("rectangle");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		
		System.out.println("==========================");
		
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성
//		Shape sh = new Shape(); //자체 객체 생성 불가
		
		Shape sh1 = new Circle();
		sh1.show("Circle");
		
		sh1 = new Triangle();
		sh1.show("Triangle");
		
		sh1 = new Rect();
		sh1.show("사각형");
		
		System.out.println("==========================");
		
		// 3. 배열을 이용한 형태
		Shape[] ss = new Shape[3]; // 배열 선언 및 생성
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rect", "Triangle"};
		
		for(int i = 0 ; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println("==========================");
		
		
	}

}
