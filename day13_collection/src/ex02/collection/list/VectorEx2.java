package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector<>(3, 5);

		v.addElement("자바"); // String
		v.addElement(new Double(10.2)); // Double
		v.addElement(date);
		System.out.println("------------3개 객체 추가------------");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("------------10개 객체 추가------------");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

		System.out.println("------------Vector 내용 출력------------");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "  ");
		}
		System.out.println("------------객체 내용 포함 확인------------");
		if (v.contains("자바"))
			System.out.println("자바 문자열 포함됨");
		else
			System.out.println("자바 미포함");

		System.out.println("10.2 객체 위치는?" + v.indexOf(new Double(10.2)));
		System.out.println("입력 시간 : " + date);
		System.out.println(v.get(v.indexOf(date)));

		// date object delete
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("****************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
//		for(i = 0; i < v.size(); i++) {
//			v.removeElementAt(i);
//		}

		System.out.println("****************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
//		for(i = 0; i < v.size(); i++) {
//			v.remove(0);
//		}
		System.out.println(v);
//		v.removeAllElements();
		v.remove("자바");
		v.remove(10.2);
		System.out.println("****************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);

		for(i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+", ");
		}
		
		System.out.println("\n++++++++++++++++++++++++++++");
		v.setElementAt("java", 2); // 3번째 위치에 java 입력
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+", ");
		}
			
		System.out.println("\n++++++++++++++++++++++++++++");
		v.trimToSize();
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		v.setSize(2); // 크기를 강제로 2로 조정
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+", ");
		}
		System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());

	}
}
