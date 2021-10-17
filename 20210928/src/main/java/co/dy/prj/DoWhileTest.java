package co.dy.prj;

import java.util.Scanner;

import co.dy.prj.friend.CompanyFriend;
import co.dy.prj.friend.Friend;
import co.dy.prj.friend.SchoolFriend;

public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);
	public Friend[] friends = new Friend[100];

	private void mainMenu() {		
		System.out.println("=================");
		System.out.println("== 1.입력 하기 ===");
		System.out.println("== 2.수정 하기 ===");
		System.out.println("== 3.조회 하기 ===");
		System.out.println("== 4.종료 하기 ===");
		System.out.println("=================");
		System.out.println("원하는 작업번호를 입력하세요?");
	}

	private void firstMenu() {
		System.out.println("=========================");
		System.out.println("===== 입력메뉴 =====");
		System.out.println("1.학교친구 2.회사동료");

		int menu = 0;
		Friend friend = null;

		while (true) {
			try {
				String num = sc.nextLine();
				menu = Integer.parseInt(num);
				break;
			} catch (Exception e) {
				System.out.println("!!!숫자를 입력하세요!!!");
			}
		}

		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("전화번호를 입력하세요: ");
		String tel = sc.nextLine();
		System.out.print("주소를 입력하세요: ");
		String address = sc.nextLine();

		if (menu == 1) {
			friend = new SchoolFriend(name, tel, address);
			System.out.println("===등록 완료===");
		} else if (menu == 2) {
			friend = new CompanyFriend(name, tel, address);
			System.out.println("===등록 완료===");
		} else {
			System.out.println("!!!친구 구분 선택에러!!");
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	private void secondMenu() {
		System.out.println("=========================");
		System.out.println("===== 수정메뉴 =====");

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.printf("[%d]이름: %s, 전화번호: %s, 주소: %s\n", i, friends[i].name, friends[i].tel,
						friends[i].address);
			}
		}

		System.out.print("수정할 인덱스 번호를 입력하세요>>");

		int index = 0;

		while (true) {
			try {
				String num = sc.nextLine();
				index = Integer.parseInt(num);
				break;
			} catch (Exception e) {
				System.out.println("!!!숫자를 입력하세요!!!");
			}
		}
		
		if(friends[index] == null) {
			System.out.println("!!!해당 인덱스는 비어있습니다!!!");
			return;
		}
		
		System.out.print("변경할 이름을 입력하세요>> ");
		String name = sc.nextLine();
		System.out.print("변경할 전화번호를 입력하세요>> ");
		String tel = sc.nextLine();
		System.out.print("변경할 주소를 입력하세요>> ");
		String address = sc.nextLine();
		
		friends[index].name = name;
		friends[index].tel = tel;
		friends[index].address = address;
	}

	private void thirdMenu() {
		System.out.println("=========================");
		System.out.println("===== 조회 메뉴 =====");

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].friendPrint();
				System.out.println();
			}
		}
	}

	private void endMenu() {
		System.out.println("==== Good bye =====");
	}

	private void doWhileMenu() {
		boolean b = false; // false

		do {
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine(); // 버퍼 클리어 역활

			switch (key) {
			case 1:
				firstMenu();
				break;
			case 2:
				secondMenu();
				break;
			case 3:
				thirdMenu();
				break;
			case 4:
				endMenu();
				b = true; // true
				break;
			default:
				System.out.println("!!!메뉴선택 에러!!!");
			}
			System.out.println();
		} while (!b); // (!b)
	}

	public void run() {
		friends[0] = new SchoolFriend("윤재광", "111-111", "서울");
		friends[1] = new SchoolFriend("하현지", "111-222", "대전");
		friends[2] = new CompanyFriend("김이사", "222-111", "부산");
		friends[3] = new CompanyFriend("남부장", "222-222", "대구");
		
		doWhileMenu();
		sc.close();
	}
}
