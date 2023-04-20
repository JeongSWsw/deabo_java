package ex03.thread;

public class MainEntry {
	public static void main(String[] args) throws InterruptedException {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.State state = Thread.currentThread().getState();
		
		
		Thread.sleep(1000);
		Thread.currentThread();
		
		int priority = Thread.currentThread().getPriority();
		
		System.out.println("현재 스레드 ID : "+id);
		System.out.println("현재 스레드 이름 : "+name);
		System.out.println("현재 스레드 priority : "+priority);
		System.out.println("현재 스레드 state : "+state);
		
		
		
	}
}
