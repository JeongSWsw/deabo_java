package ex02.runnable;

public class MainEntry {
	public static void main(String[] args) {
//		UserRunnable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);
//		t1.start(); // run 메소드를 유도
		
		new Thread(new UserRunnable("u1")).start(); // 한줄로 가능
		new Thread(new UserRunnable("u2")).start(); // 한줄로 가능
//		new Thread(new UserRunnable("u3")).start(); // 한줄로 가능
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					if(i == 3) {
						try {
							Thread.sleep(1000); // 1/1000초 ==> 1초, 예외발생
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}// if end
					System.out.println(i);
				}// for end
			}
		});
		
		new Thread(()->{
			for(int i = 1; i <= 10; i++) {
				if(i == 3) {
					try {
						Thread.sleep(1000); // 1/1000초 ==> 1초, 예외발생
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}// if end
				System.out.println(i);
			}// for end
		});
	}
}
