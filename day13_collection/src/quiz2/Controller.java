package quiz2;

import java.util.Map;

public class Controller {

	private static Integer i = new Integer(0);
	public static void addVideo(Map<Integer, Video> videos, Video video) {
		videos.put(++i, video);
	}

	public static void removeVideo(Map<Integer, Video> videos, Integer i2) {
		videos.remove(i2);
	}

	public static void listVideos(Map<Integer, Video> videos) {
		System.out.println(videos);
	}

	public static void updateVideo(Map<Integer, Video> videos, Integer i2, Video video) {
		videos.put(i2, video);
		
	}


}
