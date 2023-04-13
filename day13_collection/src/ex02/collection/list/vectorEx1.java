package ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

// List : 순서있고, 중복허용
public class vectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("length      /     capacity");
		System.out.println(v.size()+"      /     "+v.capacity());
		
		Vector<Integer> v2 = new Vector<>(3, 4); //초기용량, 증가용량
		v2.add(2);
		v2.add(12);
		v2.add(22); //초기용량 참
					// 용량 7로 늘어남
		v2.add(21);
		v2.add(23);
		v2.add(24);
		v2.add(25); // 7 참
		
		v2.add(100); // 용량 11로 늘어남
	
		System.out.println(v2.size()+"      /     "+v2.capacity());
		
		System.out.println(v2);
		System.out.println("---------------iterator() method---------------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------get() method---------------");
		for(int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		System.out.println("---------------sort method---------------");
		Collections.sort(v2);
		for(int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		System.out.println("---------------elementsAt() method---------------");
		for(int i = 0; i < v2.size(); i++) { // vector에 있는 모든 요소에 대해 반복
			Integer num = v2.elementAt(i);
			System.out.println(num);
		}
		System.out.println("---------------trimToSize() method---------------");
		System.out.println("length      /     capacity");
		v2.trimToSize(); //capacity 조정하기
		System.out.println(v2.size()+"           /         "+v2.capacity());
		
	}
}
