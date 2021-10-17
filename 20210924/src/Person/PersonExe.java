package Person;

public class PersonExe {
	private static PersonExe singleton = new PersonExe();
	private Person[] persons;

	// 생성자
	private PersonExe() {
		persons = new Person[100];
		persons[0] = new Person("홍길동", Gender.MEN, "111-222");
		persons[1] = new Student("하현지", Gender.WOMEN, "111-333", "이상초");
		persons[2] = new Worker("윤재광", Gender.MEN, "111-444", "이상컴퍼니");
	}

	// 싱글턴 인스턴스 전달 메소드
	public static PersonExe getInstance() {
		return singleton;
	}

	// 실행 메소드
	public void execute() {
		while (true) {
			// 1.추가 2.조회 3.수정 4.삭제 5.종료
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료");
			int menu = ScanUtil.readInt("메뉴를 선택하세요>>");

			if (menu == 1) {
				System.out.println("추가메뉴입니다. 다음을 선택하여주세요>>");
				addPerson();

			} else if (menu == 2) {
				System.out.println("조회");
				showList();

			} else if (menu == 3) {
				System.out.println("수정");
				modify();

			} else if (menu == 4) {
				System.out.println("삭제");
				remove();
				
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
				
			} else {
				System.out.println("잘못입력하였습니다.");
			}

			System.out.println();
		}
	}

	private void addPerson() {
		System.out.println("1.일반인 2.학생 3.직장");
		int choice = ScanUtil.readInt("메뉴를 선택하세요>>");
		String name = ScanUtil.readStr("이름을 입력하세요>>");
		String phone = ScanUtil.readStr("번호를 입력하세요>>");

		Person person = null;

		if (choice == 1) {
			System.out.println("일반인");

			while (true) {
				String gender = ScanUtil.readStr("성별을 입력하세요 ex)남자, 여자");

				if (gender.equals("남자") || gender.equals("남") || gender.equals("남성")) {
					person = new Person(name, Gender.MEN, phone);
					break;

				} else if (gender.equals("여자") || gender.equals("여") || gender.equals("녀") || gender.equals("여성")) {
					person = new Person(name, Gender.WOMEN, phone);
					break;

				} else {
					System.out.println("잘못입력하였습니다.");
				}
			} // end_while

		} else if (choice == 2) {
			System.out.println("학생");
			String school = ScanUtil.readStr("학교를 입력하세요>>");

			while (true) {
				String gender = ScanUtil.readStr("성별을 입력하세요 ex)남자, 여자");

				if (gender.equals("남자") || gender.equals("남")) {
					person = new Student(name, Gender.MEN, phone, school);
					break;

				} else if (gender.equals("여자") || gender.equals("여") || gender.equals("녀")) {
					person = new Student(name, Gender.WOMEN, phone, school);
					break;

				} else {
					System.out.println("잘못입력하였습니다.");
				}
			} // end_while

		} else if (choice == 3) {
			System.out.println("직장");
			String company = ScanUtil.readStr("직장을 입력하세요>>");

			while (true) {
				String gender = ScanUtil.readStr("성별을 입력하세요 ex)남자, 여자");

				System.out.println(gender);

				if (gender.equals("남자") || gender.equals("남")) {
					person = new Worker(name, Gender.MEN, phone, company);
					break;

				} else if (gender.equals("여자") || gender.equals("여") || gender.equals("녀")) {
					person = new Worker(name, Gender.WOMEN, phone, company);
					break;

				} else {
					System.out.println("잘못입력하였습니다.");
				}
			} // end_while
		} // end_if

		// persons배열에 person추가
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

		name = ScanUtil.readStr("찾을 이름 입력");
		phone = ScanUtil.readStr("찾을 번호 입력");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().indexOf(name) != -1
					&& persons[i].getPhone().indexOf(phone) != -1) {
				System.out.println("[" + i + "]" + persons[i].toString());
			}
		}
	}// end_showList()

	private void modify() {
		System.out.println("[목록]");

		// 친구목록 출력
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				System.out.println("[" + i + "]" + persons[i].toString());
			}
		} // end_for

		int num = ScanUtil.readInt("수정할 사람을 선택하세요>>");
		String phone = ScanUtil.readStr("바꿀 번호를 입력하세요>>");

		if (persons[num] != null) {
			if (!phone.equals("")) {
				persons[num].setPhone(phone);
			}

			if (persons[num] instanceof Student) {
				String school = ScanUtil.readStr("바꿀 학교를 입력하세요>>");

				if (!school.equals("")) {
					((Student) persons[num]).setSchool(school);
				}

			} else if (persons[num] instanceof Worker) {
				String company = ScanUtil.readStr("바꿀 회사를 입력하세요>>");

				if (!company.equals("")) {
					((Worker) persons[num]).setCompany(company);
				}
			}

			System.out.println("수정 완료.");

		} else {
			System.out.println("인덱스 값을 잘못 입력하셨습니다.");
		}

	}// end_modify()

	private void remove() {
		System.out.println("[목록]");

		// 친구목록 출력
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				System.out.println("[" + i + "]" + persons[i].toString());
			}
		} // end_for

		int num = ScanUtil.readInt("삭제할 사람을 선택하세요>>");

		if (persons[num] != null) {
			if (persons[num] != null) {
				persons[num] = null;
				System.out.println("삭제 완료.");
			} else {
				System.out.println("삭제할 사람의 정보가 없습니다.");
			}
		} else {
			System.out.println("인덱스 값을 잘못 입력하였습니다.");
		}

	}
}
