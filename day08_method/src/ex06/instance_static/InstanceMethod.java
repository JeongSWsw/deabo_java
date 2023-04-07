package ex06.instance_static;

//instance method : 객체 생성하고 사용해야함 (메모리상에 할당이 되어야...)

//class A{
//	int x, y;
//}
// 같은 패키지에 동일한 클래스가 있으면 안됨

class B {
	int x, y;
	public void setData(int xx, int yy) {
		System.out.println(xx+", "+yy);
	}
}

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B(); //객체생성, 메모리 할당, 생성자함수 자동호출
		b.setData(22, 55);
		
	}
}
