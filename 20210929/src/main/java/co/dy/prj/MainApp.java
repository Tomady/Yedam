package co.dy.prj;

import java.util.Scanner;

public class MainApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lottery lotto = new Lottery();
		lotto.run();
	}
}
