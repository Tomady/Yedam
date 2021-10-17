package co.yedam.kyobo;

import java.util.Scanner;

/*
 * 1.������� 2.������������ 3.������� 4.������ȸ 5.�������� 9.����
 * ��������: ��������/����/���ǻ�/����
 */
public class BookLibrary {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BookInfo[] kyoboLib = new BookInfo[100];

		kyoboLib[0] = new BookInfo("ȥ�ڰ����ϴ� �ڹ�", "�ſ��", "�Ѻ����ǻ�", 25000);
		kyoboLib[1] = new BookInfo("�̰��� �ڹٴ�", "�ſ��", "�Ѻ����ǻ�", 20000);
		kyoboLib[2] = new BookInfo("ȥ�ڰ����ϴ� ������", "ȫ�浿", "�츮���ǻ�", 35000);

		while (true) {
			System.out.println("1.������� 2.������������ 3.������� 4.������ȸ 5.�������� 9.����");

			int menu = readInt("�޴��� �����ϼ���>>");

			if (menu == 1) {
				System.out.println("������ϸ޴��Դϴ�.");
				// �������: ����, ����, ���ǻ�, ����.
				String title = readStr("å������ �Է��ϼ���.");
				String author = readStr("���ڸ� �Է��ϼ���,");
				String press = readStr("���ǻ縦 �Է��ϼ���.");
				int price = readInt("������ �Է��ϼ���.");

				BookInfo book = new BookInfo(title, author, press, price);

				// �����ڸ� ȣ�� => book ��������.
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) { // �迭�� ����ִ� ��ġ�� ����.
						kyoboLib[i] = book;
						break;
					}
				}
				
				System.out.println("����Ϸ�.");

			} else if (menu == 2) {
				System.out.println("�������������޴��Դϴ�.");
				//���������� ã�ƿͼ� => ������(Ű)
				//����, ���ǻ�, ���� => �׸񺯰�.
				//�ȹٲ���׸��� �״�� �Է�.
				String search = readStr("������ �������� �Է��ϼ���.");
				String author = readStr("������ ���ڸ� �Է��ϼ���[���� ���ҷ��� ����]");
				String press = readStr("������ ���ǻ縦 �Է��ϼ���[���� ���ҷ��� ����]");
				String price = readStr("������ ������ �Է��ϼ���[���� ���ҷ��� ����]");
				boolean isExist = false;
				
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().equals(search)) {
						if(!author.equals("")) {
							kyoboLib[i].setAuthor(author);
						}
						
						if(!press.equals("")) {
							kyoboLib[i].setPress(press);
						}
						
						if(!price.equals("")) {
							kyoboLib[i].setPrice(Integer.parseInt(price));
						}
						isExist = true;
					}
				}
				
				if(isExist) {
					System.out.println("���������� ����.");
				}else {
					System.out.println("�������� �ʴ� å�Դϴ�.");
				}
				
				
			} else if (menu == 3) {
				System.out.println("������ϸ޴��Դϴ�.");

				for (BookInfo book : kyoboLib) {
					if (book != null) {
						book.showInfo();
					}
				}
				
			} else if (menu == 4) {
				System.out.println("������ȸ�޴��Դϴ�.");

				String search = readStr("��ȸ�� �������� �Է��ϼ���.");
				
				for (BookInfo book : kyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1) {
						book.showInfo();
					}
				}

			} else if (menu == 5) {
				System.out.println("���������޴��Դϴ�.");

				String search = readStr("������ �������� �Է��ϼ���.");
				
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) {
						kyoboLib[i] = null;
					}
				}
				
				System.out.println("�����Ϸ�.");

			} else if (menu == 9) {
				System.out.println("���α׷��� �����մϴ�.");

				break;
				
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			
			System.out.println();
			
		} // End_while
		
		System.out.println("��");
		
	}// End_main

	// ����� �Է°��� ��ȯ.
	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	// ����� �Է°��� ��ȯ(int).
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
