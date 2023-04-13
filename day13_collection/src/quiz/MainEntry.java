package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> customers = new ArrayList<>();
		while (true) {
			System.out.println("숫자를 입력하세요.");
			System.out.println("1. 고객추가 2. 삭제 3. 고객리스트 출력 4. 수정 5.프로그램종료");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				System.out.print("추가할 고객의 이름, 주소, 전화번호를 입력하세요.");
				Customer c = new Customer(sc.next(), sc.next(), sc.next());
				addCustomer(customers, c);
				break;
			}
			case 2: {
				System.out.print("추가할 고객의 이름, 주소, 전화번호를 입력하세요.");
				Customer c = new Customer(sc.next(), sc.next(), sc.next());
				removeCustomer(customers, c);
				break;
			}
			case 3: {
				listCustomers(customers);
				break;
			}
			case 4: {
				System.out.print("수정할 고객의 이름, 주소, 전화번호를 입력하세요.");
				Customer c = new Customer(sc.next(), sc.next(), sc.next());
				System.out.print("입력할 고객의 이름, 주소, 전화번호를 입력하세요.");
				Customer c1 = new Customer(sc.next(), sc.next(), sc.next());

				updateCustomer(customers, c, c1);
				break;
			}
			case 5: {
				System.exit(0);
			}
			}
		}
	}

	private static void updateCustomer(ArrayList<Customer> customers, Customer c, Customer c1) {
		int i = customers.indexOf(c);
		customers.remove(i);
		customers.add(c1);
	}

	private static void listCustomers(ArrayList<Customer> customers) {
		for(int i =0; i < customers.size(); i++) {
			System.out.println(customers.get(i));
		}
	}

	private static void removeCustomer(ArrayList<Customer> customers, Customer c) {
		customers.remove(c);
	}

	private static void addCustomer(ArrayList<Customer> customers, Customer c) {
		customers.add(c);
	}

}
