package Person;

public class PersonExe {
	private static PersonExe singleton = new PersonExe();
	private Person[] persons;

	// ������
	private PersonExe() {
		persons = new Person[100];
		persons[0] = new Person("ȫ�浿", Gender.MEN, "111-222");
		persons[1] = new Student("������", Gender.WOMEN, "111-333", "�̻���");
		persons[2] = new Worker("���籤", Gender.MEN, "111-444", "�̻����۴�");
	}

	// �̱��� �ν��Ͻ� ���� �޼ҵ�
	public static PersonExe getInstance() {
		return singleton;
	}

	// ���� �޼ҵ�
	public void execute() {
		while (true) {
			// 1.�߰� 2.��ȸ 3.���� 4.���� 5.����
			System.out.println("1.�߰� 2.��ȸ 3.���� 4.���� 5.����");
			int menu = ScanUtil.readInt("�޴��� �����ϼ���>>");

			if (menu == 1) {
				System.out.println("�߰��޴��Դϴ�. ������ �����Ͽ��ּ���>>");
				addPerson();

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

			System.out.println();
		}
	}

	private void addPerson() {
		System.out.println("1.�Ϲ��� 2.�л� 3.����");
		int choice = ScanUtil.readInt("�޴��� �����ϼ���>>");
		String name = ScanUtil.readStr("�̸��� �Է��ϼ���>>");
		String phone = ScanUtil.readStr("��ȣ�� �Է��ϼ���>>");

		Person person = null;

		if (choice == 1) {
			System.out.println("�Ϲ���");

			while (true) {
				String gender = ScanUtil.readStr("������ �Է��ϼ��� ex)����, ����");

				if (gender.equals("����") || gender.equals("��") || gender.equals("����")) {
					person = new Person(name, Gender.MEN, phone);
					break;

				} else if (gender.equals("����") || gender.equals("��") || gender.equals("��") || gender.equals("����")) {
					person = new Person(name, Gender.WOMEN, phone);
					break;

				} else {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				}
			} // end_while

		} else if (choice == 2) {
			System.out.println("�л�");
			String school = ScanUtil.readStr("�б��� �Է��ϼ���>>");

			while (true) {
				String gender = ScanUtil.readStr("������ �Է��ϼ��� ex)����, ����");

				if (gender.equals("����") || gender.equals("��")) {
					person = new Student(name, Gender.MEN, phone, school);
					break;

				} else if (gender.equals("����") || gender.equals("��") || gender.equals("��")) {
					person = new Student(name, Gender.WOMEN, phone, school);
					break;

				} else {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				}
			} // end_while

		} else if (choice == 3) {
			System.out.println("����");
			String company = ScanUtil.readStr("������ �Է��ϼ���>>");

			while (true) {
				String gender = ScanUtil.readStr("������ �Է��ϼ��� ex)����, ����");

				System.out.println(gender);

				if (gender.equals("����") || gender.equals("��")) {
					person = new Worker(name, Gender.MEN, phone, company);
					break;

				} else if (gender.equals("����") || gender.equals("��") || gender.equals("��")) {
					person = new Worker(name, Gender.WOMEN, phone, company);
					break;

				} else {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				}
			} // end_while
		} // end_if

		// persons�迭�� person�߰�
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				persons[i] = person;
				break;
			}
		} // end_for
	}

	private void showList() {
		String name;
		String phone;

		name = ScanUtil.readStr("ã�� �̸� �Է�");
		phone = ScanUtil.readStr("ã�� ��ȣ �Է�");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().indexOf(name) != -1
					&& persons[i].getPhone().indexOf(phone) != -1) {
				System.out.println("[" + i + "]" + persons[i].toString());
			}
		}
	}// end_showList()

	private void modify() {
		System.out.println("[���]");

		// ģ����� ���
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				System.out.println("[" + i + "]" + persons[i].toString());
			}
		} // end_for

		int num = ScanUtil.readInt("������ ����� �����ϼ���>>");
		String phone = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���>>");

		if (persons[num] != null) {
			if (!phone.equals("")) {
				persons[num].setPhone(phone);
			}

			if (persons[num] instanceof Student) {
				String school = ScanUtil.readStr("�ٲ� �б��� �Է��ϼ���>>");

				if (!school.equals("")) {
					((Student) persons[num]).setSchool(school);
				}

			} else if (persons[num] instanceof Worker) {
				String company = ScanUtil.readStr("�ٲ� ȸ�縦 �Է��ϼ���>>");

				if (!company.equals("")) {
					((Worker) persons[num]).setCompany(company);
				}
			}

			System.out.println("���� �Ϸ�.");

		} else {
			System.out.println("�ε��� ���� �߸� �Է��ϼ̽��ϴ�.");
		}

	}// end_modify()

	private void remove() {
		System.out.println("[���]");

		// ģ����� ���
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				System.out.println("[" + i + "]" + persons[i].toString());
			}
		} // end_for

		int num = ScanUtil.readInt("������ ����� �����ϼ���>>");

		if (persons[num] != null) {
			if (persons[num] != null) {
				persons[num] = null;
				System.out.println("���� �Ϸ�.");
			} else {
				System.out.println("������ ����� ������ �����ϴ�.");
			}
		} else {
			System.out.println("�ε��� ���� �߸� �Է��Ͽ����ϴ�.");
		}

	}
}
