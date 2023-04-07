package ex02.oop;

import java.lang.*; // 자동임포트

// class 여러개 일 때 
class Point {// extends Object { // Object class 상속 받고 있었음
	private int x, y; // 멤버변수 - 접근지정자 : private < default < protected < public
						// 클래스 변수는 기본적으로 초기화 됨
	public void display() {
		System.out.println(x+", "+y);
		System.out.println(getX()+", "+y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}// Point end

class A {
	
}

class B {
	
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println();
		pt.display();
		int xx;
//		System.out.println(xx); //local variable은 초기화 필요
	}
}// MainEntry end
