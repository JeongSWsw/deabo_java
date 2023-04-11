package quiz;

public class Bus implements Trans {
	private double speed = 0;

	@Override
	public void start(String name) {
		System.out.println(name+"이(가) 출발합니다.");
		while(speed < 5) {
			speed += (accelerator * 5);
			System.out.println("Accelerating..."+speed);
			
			try {
				Thread.sleep(500); //1/1000 -> 1초
			}catch(Exception e) {
				e.printStackTrace();
			}
		} // while end

	}

	@Override
	public void stop(String name) {
		System.out.println(name+"이(가) 멈췄습니다.");
		speed = 0;

	}

}
