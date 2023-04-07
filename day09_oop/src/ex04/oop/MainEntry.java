package ex04.oop;

public class MainEntry {
	public static void main(String[] args) {
		Person p = new Person();
	
		p.setName("doyeon");
		p.setAge(33);
		
		System.out.println(p); // toString()
		System.out.println(p.toString()); // toString()

	}
}
