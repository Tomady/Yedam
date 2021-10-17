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
		System.out.println("== 1.�Է� �ϱ� ===");
		System.out.println("== 2.���� �ϱ� ===");
		System.out.println("== 3.��ȸ �ϱ� ===");
		System.out.println("== 4.���� �ϱ� ===");
		System.out.println("=================");
		System.out.println("���ϴ� �۾���ȣ�� �Է��ϼ���?");
	}

	private void firstMenu() {
		System.out.println("=========================");
		System.out.println("===== �Է¸޴� =====");
		System.out.println("1.�б�ģ�� 2.ȸ�絿��");

		int menu = 0;
		Friend friend = null;

		while (true) {
			try {
				String num = sc.nextLine();
				menu = Integer.parseInt(num);
				break;
			} catch (Exception e) {
				System.out.println("!!!���ڸ� �Է��ϼ���!!!");
			}
		}

		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
		String tel = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ���: ");
		String address = sc.nextLine();

		if (menu == 1) {
			friend = new SchoolFriend(name, tel, address);
			System.out.println("===��� �Ϸ�===");
		} else if (menu == 2) {
			friend = new CompanyFriend(name, tel, address);
			System.out.println("===��� �Ϸ�===");
		} else {
			System.out.println("!!!ģ�� ���� ���ÿ���!!");
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
		System.out.println("===== �����޴� =====");

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.printf("[%d]�̸�: %s, ��ȭ��ȣ: %s, �ּ�: %s\n", i, friends[i].name, friends[i].tel,
						friends[i].address);
			}
		}

		System.out.print("������ �ε��� ��ȣ�� �Է��ϼ���>>");

		int index = 0;

		while (true) {
			try {
				String num = sc.nextLine();
				index = Integer.parseInt(num);
				break;
			} catch (Exception e) {
				System.out.println("!!!���ڸ� �Է��ϼ���!!!");
			}
		}
		
		if(friends[index] == null) {
			System.out.println("!!!�ش� �ε����� ����ֽ��ϴ�!!!");
			return;
		}
		
		System.out.print("������ �̸��� �Է��ϼ���>> ");
		String name = sc.nextLine();
		System.out.print("������ ��ȭ��ȣ�� �Է��ϼ���>> ");
		String tel = sc.nextLine();
		System.out.print("������ �ּҸ� �Է��ϼ���>> ");
		String address = sc.nextLine();
		
		friends[index].name = name;
		friends[index].tel = tel;
		friends[index].address = address;
	}

	private void thirdMenu() {
		System.out.println("=========================");
		System.out.println("===== ��ȸ �޴� =====");

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
			sc.nextLine(); // ���� Ŭ���� ��Ȱ

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
				System.out.println("!!!�޴����� ����!!!");
			}
			System.out.println();
		} while (!b); // (!b)
	}

	public void run() {
		friends[0] = new SchoolFriend("���籤", "111-111", "����");
		friends[1] = new SchoolFriend("������", "111-222", "����");
		friends[2] = new CompanyFriend("���̻�", "222-111", "�λ�");
		friends[3] = new CompanyFriend("������", "222-222", "�뱸");
		
		doWhileMenu();
		sc.close();
	}
}
