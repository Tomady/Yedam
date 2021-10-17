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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 >> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// 1.계좌생성
				createAccount();

			} else if (selectNo == 2) {
				// 2.계좌목록
				accountList();

			} else if (selectNo == 3) {
				// 3.예금
				deposit();

			} else if (selectNo == 4) {
				// 4.출금
				withdraw();

			} else if (selectNo == 5) {
				// 5.종료
				System.out.println("종료합니다.");
				break;

			} else {
				// 예외처리
				System.out.println("잘못입력하셨습니다.");
			}
		} // End_while
	}// End_main

	private static void createAccount() {
		sc.nextLine();
		String accountNum = readStr("계좌번호: ");
		String accountOwn = readStr("계좌주: ");
		int account_money = readInt("초기입금금액: ");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(accountNum, accountOwn, account_money);
				break;
			}
		}

		System.out.println("결과 : 계좌가 생성되었습니다");
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
		// 계좌번호 입력받아 찾기
		sc.nextLine();
		String ano = readStr("계좌번호: ");
		// 예금액
		int money = readInt("예금액: ");
		Account ac = findAccount(ano);
		ac.setBalance(money += ac.getBalance());
		System.out.println("예금이 성공되었습니다.");
	}

	private static void withdraw() {
		// 출금계좌 찾기
		sc.nextLine();
		String ano = readStr("계좌번호: ");
		// 출금액 계산
		int money = readInt("출금액: ");
		Account ac = findAccount(ano);
		if (ac.getBalance() < money) {
			System.out.println("출금 가능액을 초과하였습니다.");
		} else {
			ac.setBalance(money = ac.getBalance() - money);
			System.out.println("출금이 성공되었습니다.");
		}
		// 결과
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
			System.out.println("잘못입력하셨습니다.");
		}

		return retNum;
	}
}
