package quiz2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BMIView {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> persons = new ArrayList<>();
		
		while (true) {
			System.out.println("1.추가 2.삭제 3.출력 4.수정 5.파일저장 6.종료");
			int num = Integer.parseInt(br.readLine());
			switch (num) {
			case (1):
				System.out.println("추가할 사람의 이름, 성별(m/f), 키, 몸무게 순으로 입력하세요");
				Person p1 = new Person(br.readLine(), br.readLine().charAt(0), Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
				BMIController.addPerson(persons, p1);
				break;
			case (2):
				BMIController.listPersons(persons);
				System.out.println("삭제할 사람의 번호를 입력하세요.");
				BMIController.removePerson(persons, Integer.parseInt(br.readLine()));
				break;
			case (3):
				BMIController.listPersons(persons);
				break;
			case (4):
				BMIController.listPersons(persons);
				System.out.println("수정할 사람의 번호를 입력하세요.");
				int i = Integer.parseInt(br.readLine());
				System.out.println("수정할 사람의 이름, 성별(m/f), 키, 몸무게 순으로 입력하세요");
				Person p2 = new Person(br.readLine(), br.readLine().charAt(0), Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
				BMIController.updatePerson(persons, i, p2);
				break;
			case (5):
				BMIController.savePersons(persons);
				break;
			case (6):
				System.exit(0);
				break;

			}// switch end
		} // while end
	}
}
