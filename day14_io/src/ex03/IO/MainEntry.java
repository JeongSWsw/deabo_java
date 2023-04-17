package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in; // 표준입력
		
		try {
			System.out.print("단일 문자 입력 : ");
			int num = is.read()-48;
			is.read(); is.read(); // 엔터 받는 역할
			int num2 = is.read()-48;
			
			System.out.println(num+num2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
