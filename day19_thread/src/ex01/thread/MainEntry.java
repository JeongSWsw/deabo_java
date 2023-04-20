package ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.run(); // thread를 실행한게 아닌 , 명시적으로 run메소드를 호출한 것
		t1.start(); // run() 메소드 유도
		t2.start();
		t3.start();
		
	}
}
