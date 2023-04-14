package quiz2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import quiz.Customer;

public class View {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Video> videos = new HashMap<>();
		while (true) {
			System.out.println("숫자를 입력하세요.");
			System.out.println("1. video 추가 2. video 삭제 3. video 리스트 출력 4. 수정 5.프로그램종료");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				System.out.print("추가할 video의 제목, 장르, 대여여부, 대여자를 입력하세요.");
				Video video = new Video(sc.next(), sc.next(), sc.nextBoolean(), sc.next());
				Controller.addVideo(videos, video);
				break;
			}
			case 2: {
				Controller.listVideos(videos);
				System.out.print("삭제할 video의 번호를 입력하세요.");
//				Video video = new Video(sc.next(),sc.next(),sc.nextBoolean(),sc.next());
				Integer i = new Integer(sc.nextInt());
				Controller.removeVideo(videos, i);
				break;
			}
			case 3: {
				Controller.listVideos(videos);
				break;
			}
			case 4: {
				Controller.listVideos(videos);
				System.out.print("수정할 video의 번호를 입력하세요");
				Integer i = new Integer(sc.nextInt());
				System.out.print("수정할 video의 제목, 장르, 대여여부, 대여자를 입력하세요.");
				Video video = new Video(sc.next(), sc.next(), sc.nextBoolean(), sc.next());
				Controller.updateVideo(videos, i, video);
				break;
			}
			case 5: {
				System.exit(0);
			}
			}
		}
	}
}