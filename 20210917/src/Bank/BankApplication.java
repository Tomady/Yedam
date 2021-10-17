package Bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	static int num = 0;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------");
			System.out.print("���� >> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// 1.���»���
				createAccount();

			} else if (selectNo == 2) {
				// 2.���¸��
				accountList();

			} else if (selectNo == 3) {
				// 3.����
				deposit();

			} else if (selectNo == 4) {
				// 4.���
				withdraw();

			} else if (selectNo == 5) {
				// 5.����
				System.out.println("�����մϴ�.");
				break;

			} else {
				// ����ó��
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		} // End_while
	}// End_main

	private static void createAccount() {
		sc.nextLine();
		String accountNum = readStr("���¹�ȣ: ");
		String accountOwn = readStr("������: ");
		int account_money = readInt("�ʱ��Աݱݾ�: ");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(accountNum, accountOwn, account_money);
				break;
			}
		}

		System.out.println("��� : ���°� �����Ǿ����ϴ�");
	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s %d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}
	}

	private static void deposit() {
		// ���¹�ȣ �Է¹޾� ã��
		sc.nextLine();
		String ano = readStr("���¹�ȣ: ");
		// ���ݾ�
		int money = readInt("���ݾ�: ");
		Account ac = findAccount(ano);
		ac.setBalance(money += ac.getBalance());
		System.out.println("������ �����Ǿ����ϴ�.");
	}

	private static void withdraw() {
		// ��ݰ��� ã��
		sc.nextLine();
		String ano = readStr("���¹�ȣ: ");
		// ��ݾ� ���
		int money = readInt("��ݾ�: ");
		Account ac = findAccount(ano);
		if (ac.getBalance() < money) {
			System.out.println("��� ���ɾ��� �ʰ��Ͽ����ϴ�.");
		} else {
			ac.setBalance(money = ac.getBalance() - money);
			System.out.println("����� �����Ǿ����ϴ�.");
		}
		// ���
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}

	private static String readStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int retNum = 0;
		try {
			String num = sc.nextLine();
			retNum = Integer.parseInt(num);
		} catch (Exception e) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

		return retNum;
	}
}
