package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		dao = new MemberServiceImpl();
		MemberVO member = null;
		boolean login_sw = false;

		while (!login_sw) {
			member = new MemberVO();
			System.out.println("아이디를 입력하세요:");
			member.setId(sc.nextLine());
			System.out.println("패스워드를 입력하세요:");
			member.setPassword(sc.nextLine());

			member = dao.memberLogin(member); // null

			if (member != null) {
				System.out.println("로그인 성공.");
				login_sw = true;
			} else {
				System.out.println("로그인 실패.");
			}
		}

		return member;
	}

}
