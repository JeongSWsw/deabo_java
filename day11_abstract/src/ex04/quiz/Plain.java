package ex04.quiz;

public class Plain extends Trans{

	int count = 0;
	@Override
	public void run() {
		try {
			while(true) {
				t.sleep(1000);
				
				switch (count) {
				case 0:
					start();
					break;
				case 1:
					process();
					break;
					
				case 2:
					stop();
					break;
				}
				count++;
				if(count == 3)  break;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Override
	public void start() {
		message = "비행기가 출발합니다.";
		System.out.println(message);				
	}

	@Override
	public void process() {
		message = "비행기가 진행중입니다.";
		System.out.println(message);			
	}

	@Override
	public void stop() {
		message = "비행기가 멈췄습니다.";
		System.out.println(message);		
			
	}

}
