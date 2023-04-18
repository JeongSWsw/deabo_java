package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calProgram {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("su1 = ");
		int su1 = Integer.parseInt(br.readLine());
		System.out.print("su2 = ");
		int su2 = Integer.parseInt(br.readLine());
		System.out.print("op = ");
		char op = br.readLine().charAt(0);
		double result = 0;
		
		switch(op){
			case '+' :
				result = su1+su2;
				break;
			case '-' :
				result = su1-su2;
				break;
			case '/' :
				result = (double)su1/su2;
				break;
			case '*' :
				result = su1*su2;
				break;
			
		}
		System.out.printf("%d %c %d = %.2f",su1, op, su2, result);
	}
}
