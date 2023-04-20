package ex02.runnable;

public class MainEntry {
	public static void main(String[] args) {
//		UserRunnable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);
//		t1.start(); // run 메소드를 유도
		
		new Thread(new UserRunnable("u1")).start(); // 한줄로 가능
		new Thread(new UserRunnable("u2")).start(); // 한줄로 가능
		new Thread(new UserRunnable("u3")).start(); // 한줄로 가능
	}
}
