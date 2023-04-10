package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape { // Sub class
	// show
	// calc
	public Triangle() {
	}
	public Triangle(int w, int h) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 = ");
		this.w = sc.nextInt();

		System.out.print("높이 = ");
		this.h = sc.nextInt();
	}

	public double calc() {
		this.result = (double) (w * h) / 2;
		return result;
	}

	public void show() {
		System.out.println("밑변 = "+w+", 높이 = "+h+", 너비 = "+calc());
	}
}
