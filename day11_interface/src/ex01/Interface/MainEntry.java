package ex01.Interface;

interface A { // interface - abstract method, final field만 갖는다.
	int x = 90; // final static int x = 90;
	final int y = 777;
	char ch = 'A';
	
	//추상메소드, abstract 생략가능함 - 무조건 추상메소드임
	public void show(); //{} abstract method는 body를 가질 수 없음
	public abstract void disp();
} //A end
interface B{
	void view();
} //B end

interface C {
	String name = "happy";
	public void draw();
} // C end

interface D extends B { // 인터페이스 간에도 상속이 가능하다.
	void dview();
} // D end

class Rect implements D {

	@Override
	public void view() { // B interface method
		
	}

	@Override
	public void dview() { // D interface method
		
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
	
}

class Shape {
	
} // Shape class

class Circle implements C {
//	name = "doyeon"; // 값 변경 불가

	@Override
	public void draw() {
		System.out.println(name+"님");
	}

}

class Multi extends Shape implements B, C, A{

	@Override
	public void show() { // A interface method
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {// A interface method
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {// C interface method
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {// B interface method
		// TODO Auto-generated method stub
		
	}
	
} // Multi end

public class MainEntry {
	public static void main(String[] args) {
//		A a = new A(); // 인터페이스는 객체 생성 할 수 없다.
		
		
	}
}
