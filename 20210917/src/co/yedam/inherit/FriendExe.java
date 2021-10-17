package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// ģ��, �б�ģ��, ȸ��ģ�� => �迭�� ����.
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("ȫ�浿", "1111-1211");
		friends[5] = new Friend("ȫ�浿", "1111-1234");
		friends[1] = new Friend("��浿", "2222-1211");
		friends[2] = new Friend("ȫ����", "2222-1311");
		friends[3] = new UnivFriend("�ڼ���", "2345-1234", "���а�");
		friends[4] = new CompFriend("��ö��", "2222-1212", "������");
	}

	public static FriendExe getInstance() {

		return singleton;
	}

	public void execute() {

		while (true) {
			System.out.println("-----------------------");
			System.out.println("1.��� 2.��ȸ 3.���� 4.���� 5.����");
			System.out.println("-----------------------");

			int menu = ScanUtil.readInt("�޴��� �����ϼ���."); // �ν��Ͻ� �޸� �Ҵ�. -> static

			if (menu == 1) {
				System.out.println("���");
				addFriend();

			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();

			} else if (menu == 3) {
				System.out.println("����");
				modify();

			} else if (menu == 4) {
				System.out.println("����");
				remove();

			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;

			} else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		} // end_while

		System.out.println("��.");
	}// end_excute()

	// ��� �޼ҵ�
	private void addFriend() {
		// ģ��, �б�ģ��, ȸ��ģ��
		System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ��");
		int choice = ScanUtil.readInt("�޴��� ����");

		String name = ScanUtil.readStr("ģ���̸� �Է�");
		String phone = ScanUtil.readStr("����ó�� �Է�");

		Friend friend = null;

		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("���� �Է�");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ� �Է�");
			friend = new CompFriend(name, phone, depart);

		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		} // end_for

		System.out.println("��� ����.");


	}// end_addFrined()

	// ��ȸ �޼ҵ�
	private void showList() {
		// �̸�, ����ó �Է� => ȫ�浿, ��浿�� ���� ��, "�浿"�� �Է��ϸ� ȫ�浿, ��浿 �� �� ������.
		// ����ó - 1111-1211, 2222-1211�� ���� ��, "1211"�� �Է����� �� �� �� ������.
		// �浿, 1211 -> �̸� & ����ó.
		String name;
		String phone;

		name = ScanUtil.readStr("ã�� �̸� �Է�");
		phone = ScanUtil.readStr("ã�� ��ȣ �Է�");

		// �� �ڵ�
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
				System.out.println(friends[i].toString());
			}
		}

		// ������ �ڵ�
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] != null) {
//				if (!name.equals("") && !phone.equals("")) { // �̸� && ��ȭ��ȣ
//					if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
//						System.out.println(friends[i].toString());
//					}
//				} else if (!phone.equals("")) { // ��ȭ��ȣ
//					if (friends[i].getPhone().indexOf(phone) != -1) {
//						System.out.println(friends[i].toString());
//					}
//				} else if (!name.equals("")) { // �̸�
//					if (friends[i].getName().indexOf(name) != -1) {
//						System.out.println(friends[i].toString());
//					}
//				} else {
//					System.out.println(friends[i].toString());
//				}
//			} // end_if1
//		} // end_for
	}// end_showList

	// ���� �޼ҵ�
	private void modify() {
		System.out.println("[ģ�����]");

		// ģ����� ���
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "]" + friends[i].toString());
			}
		} // end_for

		int num = ScanUtil.readInt("������ ģ���� �����ϼ���");
		String phone = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���");

		if (!phone.equals("")) {
			friends[num].setPhone(phone);
		}

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���");

			if (!major.equals("")) {
				((UnivFriend) friends[num]).setMajor(major);
			}

		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("�ٲ� �μ��� �Է��ϼ���");

			if (!depart.equals("")) {
				((CompFriend) friends[num]).setDepart(depart);
			}
		}

		System.out.println("���� �Ϸ�.");

	}// end_modify()

	// ����
	private void remove() {
		System.out.println("[ģ�����]");

		// ģ����� ���
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "]" + friends[i].toString());
			}
		} // end_for

		int num = ScanUtil.readInt("������ ģ���� �����ϼ���");

		if (friends[num] != null) {
			friends[num] = null;
			System.out.println("���� �Ϸ�.");
		} else {
			System.out.println("������ ģ�� ������ �����ϴ�.");
		}

	}
}// end_FriendExe_class()
