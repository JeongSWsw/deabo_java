package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] tt = new Trans[] {new Subway(), new Bus(), new Bicycle(), new Plane()};
		String[] str = new String[] {"지하철","버스","자전거","비행기"};
		for(int i = 0 ; i < tt.length; i++) {
			tt[i].start(str[i]);
			tt[i].stop(str[i]);
		}
	}
	
}
