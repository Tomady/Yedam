package co.dy.prj;

import java.util.Scanner;

import co.dy.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
//		Member member = new Member("hong", "1234", "ȫ�浿", "�뱸������");
//		member.run();
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ���� �Է��ϼ���");
		int num2 = sc.nextInt();
		
		MySum sum = new MySum(num1, num2);
		sum.run();
	}
}
