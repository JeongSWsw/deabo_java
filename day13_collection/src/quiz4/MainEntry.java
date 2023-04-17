package quiz4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import quiz2.Controller;
import quiz2.Video;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> students = new HashMap<>();
		Map<Integer, Person> persons = new HashMap<>();
		Map<Integer, Worker> workers = new HashMap<>();
//		while (true) {
//			System.out.println("숫자를 입력하세요.");
//			System.out.println("1. 학생 추가 2. 근로자 추가 3. 학생 리스트 출력 4. 근로자 리스트 출력 5.학생 수정 6. 근로자 수정 7. 프로그램 종료");
//			int num = sc.nextInt();
//			switch (num) {
//			case 1: {
//				System.out.print("추가할 학생의 이름, 핸드폰, 반, 점수를 입력하세요.");
//				Video video = new Video(sc.next(), sc.next(), sc.nextBoolean(), sc.next());
//				Controller.addVideo(videos, video);
//				break;
//			}
//			case 2: {
//				Controller.listVideos(videos);
//				System.out.print("삭제할 video의 번호를 입력하세요.");
////				Video video = new Video(sc.next(),sc.next(),sc.nextBoolean(),sc.next());
//				Integer i = new Integer(sc.nextInt());
//				Controller.removeVideo(videos, i);
//				break;
//			}
//			case 3: {
//				Controller.listVideos(videos);
//				break;
//			}
//			case 4: {
//				Controller.listVideos(videos);
//				System.out.print("수정할 video의 번호를 입력하세요");
//				Integer i = new Integer(sc.nextInt());
//				System.out.print("수정할 video의 제목, 장르, 대여여부, 대여자를 입력하세요.");
//				Video video = new Video(sc.next(), sc.next(), sc.nextBoolean(), sc.next());
//				Controller.updateVideo(videos, i, video);
//				break;
//			}
//			case 5: {
//				System.exit(0);
//			}
//			}
//		}
	}
}
