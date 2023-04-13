package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서없고, 중복 허용 X

public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println(hs);
		System.out.println("요소 개수 : " + hs.size());
		
		HashSet<Integer> hs2 = new HashSet<>();
		// Collection type parameter 안에는 reference 타입만 와야한다
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("string");
		
		HashSet hs3 = new HashSet<>();
		hs3.add(10.0);
		hs3.add(3);
		hs3.add(1000);
		hs3.add("string");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) { //다음 요소가 있다면, ...
			System.out.println(it.next()); // 요소를 꺼내와서 출력
		}
		System.out.println();
		it = hs3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
