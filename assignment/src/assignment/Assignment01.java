package assignment;

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		System.out.print("첫번째 수 : ");
		int x = new Scanner(System.in).nextInt();
		System.out.print("두번째 수 : ");
		int y = new Scanner(System.in).nextInt();
		System.out.print("세번째 수 : ");
		int z = new Scanner(System.in).nextInt();

		if(x > y && y > z) {
			System.out.println(x + " > " + y + " > " + z);
		}
		else if(x > y && y < z) { 
			if(x > z) { // x > z> y
				System.out.println(x + " > " + z + " > " + y);
			}
			else // z > x > y
				System.out.println(z + " > " + x + " > " + y);
		}
		else if(x < y && y > z) { // x , z < y
			if(x > z) { // y>x>z
				System.out.println(y + " > " + x + " > " + z);
			}
			else // y>z>x
				System.out.println(y + " > " + z + " > " + x);
		}
		else
			System.out.println(z + " > " + y + " > " + x);

	}
}
