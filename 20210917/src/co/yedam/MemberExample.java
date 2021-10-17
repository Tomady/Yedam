package co.yedam;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();

		m1.memberId = 10;
		m1.name = "박미림";
		m1.phone = "010-1111-2222";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "홍길동";
		m2.phone = "010-3333-4444";

		Member[] members = { m1, m2 };

		for (Member member : members) {
			System.out.println("ID: " + member.memberId);
			System.out.println("이름: " + member.name);
			System.out.println("연락처: " + member.phone);
		}

		m1.name = "김미림";
		members[0].phone = "010-5555-6666";

		for (Member member : members) {
			member.showInfo();
		}
	}
}
