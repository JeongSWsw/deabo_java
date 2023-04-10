package ex04.quiz;

public class Bus extends Trans{
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
		message = "Bus가 출발합니다.";
		System.out.println(message);		
	}

	@Override
	public void process() {
		message = "Bus가 진행중입니다.";
		System.out.println(message);		
	}

	@Override
	public void stop() {
		message = "Bus가 멈췄습니다.";
		System.out.println(message);		
	}

}
