package friend;
/*
 * ģ�� ��� ����.
 * �̸�, ����ó, email, Ű, ������.
 * 1.���, 2.��ȸ(�̸�), 3.���, 4.����, 5.����, 9.����.
 */

import java.util.Scanner;

public class FriendMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] fd = new Friend[100];
		fd[0] = new Friend("ȫ�浿", "010-1111", "aaa@gmail.com",  160, 65);
		fd[1] = new Friend("������", "010-2222", "bbb@gmail.com",  170, 70);
		fd[2] = new Friend("�����", "010-3333", "ccc@gmail.com",  175, 75);
		fd[3] = new Friend("������", "010-4444", "ddd@gmail.com",  180, 80);
		fd[4] = new Friend("��å��", "010-5555", "fff@gmail.com",  185, 85);

		while (true) {
			showMenu();
			int menu = readInt("�޴��� �����ϼ���");

			if (menu == 1) {
				System.out.println("1.���");
				String name = readStr("�̸��� �Է��ϼ���.");
				String phone = readStr("����ó�� �Է��ϼ���.");
				String email = readStr("email�� �Է��ϼ���.");
				double height = readDouble("Ű�� �Է��ϼ���.");
				double weight = readDouble("�����Ը� �Է��ϼ���.");
				
				for(int i=0; i<fd.length; i++) {
					if(fd[i] == null) {
						fd[i] = new Friend(name, phone, email, height, weight);
						break;
					}
				}
				System.out.println("��� �Ϸ�.");

			} else if (menu == 2) {
				System.out.println("2.��ȸ(�̸�)");
				String search = readStr("�̸��� �Է��ϼ���");
				
				for(Friend mem : fd) {
					if(mem != null && mem.getName().indexOf(search) != -1) {
						mem.showInfo();
					}
				}

			} else if (menu == 3) {
				System.out.println("3.���");
				
				for(Friend mem : fd) {
					if(mem != null) {
						mem.showInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("4.����");
				
				String search = readStr("������ �̸��� �Է��ϼ���.");
				String phone = readStr("������ ��ȣ�� �Է��ϼ���[���� ���ҷ��� ����]");
				String email = readStr("������ �̸����� �Է��ϼ���[���� ���ҷ��� ����]");
				String height = readStr("������ Ű�� �Է��ϼ���[���� ���ҷ��� ����]");
				String weight = readStr("������ �����Ը� �Է��ϼ���[���� ���ҷ��� ����]");
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
					System.out.println("���������� ����.");
				}else {
					System.out.println("���� ģ���Դϴ�.");
				}
				

			} else if (menu == 5) {
				System.out.println("5.����");

				String search = readStr("������ ģ�� �̸��� �Է��ϼ���.");
				
				for (int i = 0; i < fd.length; i++) {
					if (fd[i] != null && fd[i].getName().indexOf(search) != -1) {
						fd[i] = null;
					}
				}
				
				System.out.println("�����Ϸ�.");
				
			} else if (menu == 9) {
				System.out.println("9. ����");
				break;

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}

			System.out.println("");

		}
		System.out.println("��.");

	}

	public static void showMenu() {
		System.out.println("1.���, 2.��ȸ, 3.���, 4.����, 5.����, 9.����");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}

		return result;
	}
}
