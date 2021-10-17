package co.dy.prj;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
	private int money;

	Lottery() {
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	private void printLotto(int[] lotto, int money) {

		for (int i = 0; i < money / 5000; i++) {
			System.out.println("====================");

			for (int k = 0; k < 5; k++) {
				setLotto(lotto);
				System.out.printf("[%d]게임 : ", k + 1);

				for (int m = 0; m < lotto.length; m++) {
					System.out.printf("%2d ", lotto[m]);
				}
				System.out.println();
			}
			System.out.println("====================");
		}

		System.out.println("거스름돈 : " + money % 5000);
	}

	private int[] setLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int k = 0; k < i; k++) {
				if (lotto[k] == lotto[i]) {
					i--;
					break;
				}
			}
		} // end_for

		Arrays.sort(lotto);

		return lotto;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		int money = 0;

		System.out.print("금액을 입력하세요(단위: 원) >> ");
		money = sc.nextInt();

		printLotto(lotto, money);
	}// end_run()

}
