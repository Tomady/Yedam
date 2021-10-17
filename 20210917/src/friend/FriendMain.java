package friend;
/*
 * 친구 목록 관리.
 * 이름, 연락처, email, 키, 몸무게.
 * 1.등록, 2.조회(이름), 3.목록, 4.수정, 5.삭제, 9.종료.
 */

import java.util.Scanner;

public class FriendMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] fd = new Friend[100];
		fd[0] = new Friend("홍길동", "010-1111", "aaa@gmail.com",  160, 65);
		fd[1] = new Friend("남차장", "010-2222", "bbb@gmail.com",  170, 70);
		fd[2] = new Friend("김부장", "010-3333", "ccc@gmail.com",  175, 75);
		fd[3] = new Friend("윤선임", "010-4444", "ddd@gmail.com",  180, 80);
		fd[4] = new Friend("서책임", "010-5555", "fff@gmail.com",  185, 85);

		while (true) {
			showMenu();
			int menu = readInt("메뉴를 선택하세요");

			if (menu == 1) {
				System.out.println("1.등록");
				String name = readStr("이름을 입력하세요.");
				String phone = readStr("연락처를 입력하세요.");
				String email = readStr("email을 입력하세요.");
				double height = readDouble("키를 입력하세요.");
				double weight = readDouble("몸무게를 입력하세요.");
				
				for(int i=0; i<fd.length; i++) {
					if(fd[i] == null) {
						fd[i] = new Friend(name, phone, email, height, weight);
						break;
					}
				}
				System.out.println("등록 완료.");

			} else if (menu == 2) {
				System.out.println("2.조회(이름)");
				String search = readStr("이름을 입력하세요");
				
				for(Friend mem : fd) {
					if(mem != null && mem.getName().indexOf(search) != -1) {
						mem.showInfo();
					}
				}

			} else if (menu == 3) {
				System.out.println("3.목록");
				
				for(Friend mem : fd) {
					if(mem != null) {
						mem.showInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("4.수정");
				
				String search = readStr("수정할 이름을 입력하세요.");
				String phone = readStr("변경할 번호를 입력하세요[변경 안할려면 엔터]");
				String email = readStr("변경할 이메일을 입력하세요[변경 안할려면 엔터]");
				String height = readStr("변경할 키를 입력하세요[변경 안할려면 엔터]");
				String weight = readStr("변경할 몸무게를 입력하세요[변경 안할려면 엔터]");
				boolean isExist = false;
				
				for (int i = 0; i < fd.length; i++) {
					if (fd[i] != null && fd[i].getName().equals(search)) {
						if(!phone.equals("")) {
							fd[i].setPhone(phone);
						}
						
						if(!email.equals("")) {
							fd[i].setE_mail(email);
						}
						
						if(!height.equals("")) {
							fd[i].setHeight(Double.parseDouble(height));
						}
						
						if(!weight.equals("")) {
							fd[i].setWeight(Double.parseDouble(weight));
						}
						isExist = true;
					}
				}
				
				if(isExist) {
					System.out.println("정상적으로 수정.");
				}else {
					System.out.println("없는 친구입니다.");
				}
				

			} else if (menu == 5) {
				System.out.println("5.삭제");

				String search = readStr("삭제할 친구 이름을 입력하세요.");
				
				for (int i = 0; i < fd.length; i++) {
					if (fd[i] != null && fd[i].getName().indexOf(search) != -1) {
						fd[i] = null;
					}
				}
				
				System.out.println("삭제완료.");
				
			} else if (menu == 9) {
				System.out.println("9. 종료");
				break;

			} else {
				System.out.println("잘못입력하셨습니다.");
			}

			System.out.println("");

		}
		System.out.println("끝.");

	}

	public static void showMenu() {
		System.out.println("1.등록, 2.조회, 3.목록, 4.수정, 5.삭제, 9.종료");
	}

	public static String readStr(String msg) {
		System.out.println(msg);

		return sc.nextLine();
	}

	public static double readDouble(String msg) {
		System.out.println(msg);

		double result = 0;

		while (true) {
			String val = sc.nextLine();

			try {
				result = Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
			}
		}

		return result;
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);

		int result = 0;

		while (true) {
			String val = sc.nextLine();

			try {
				result = Integer.parseInt(val); // "1000" -> 1000
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
			}
		}

		return result;
	}
}
