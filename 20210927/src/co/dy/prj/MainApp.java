package co.dy.prj;

import java.util.Scanner;

import co.dy.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
//		Member member = new Member("hong", "1234", "홍길동", "대구광역시");
//		member.run();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 수를 입력하세요");
		int num2 = sc.nextInt();
		
		MySum sum = new MySum(num1, num2);
		sum.run();
	}
}
