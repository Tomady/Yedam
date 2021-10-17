package co.yedam;

import java.util.Scanner;

public class ScanUtil {
	static Scanner sc = new Scanner(System.in);

	public static int readInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static String readStr(String msg) {
//		if(sc.hasNextLine()) {
//			sc.nextLine();
//		}
		System.out.println(msg);
		return sc.nextLine();
	}
}
