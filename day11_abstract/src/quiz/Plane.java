package quiz;

public class Plane extends Trans{

	@Override
	public void start(String name) {
		System.out.println(name+"이(가) 출발합니다.");
		
	}

	@Override
	public void stop(String name) {
		System.out.println(name+"이(가) 멈췄습니다.");
		
	}

}
