package quiz;

public class MainEntry {
	public static void main(String[] args) {

		Trans[] tt = new Trans[4];
		tt[0] = new Subway();
		tt[1] = new Bus();
		tt[2] = new Bicycle();
		tt[3] = new Plane();
		
		String[] str = new String[] {"지하철","버스","자전거","비행기"};
		
		for (int i = 0; i < tt.length; i++) {
			tt[i].start(str[i]);
			tt[i].stop(str[i]);
		}

		Trans[] t = new Trans[4];
		Object[] name = {new Bicycle(), new Bus(), new Subway(), new Plane()};
		for(int i = 0; i < name.length; i++) {
			t[i] = (Trans)name[i];
			t[i].start(str[i]);
			t[i].stop(str[i]);
		}
	}

}
