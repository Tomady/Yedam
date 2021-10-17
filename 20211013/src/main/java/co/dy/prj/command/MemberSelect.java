package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;

	@Override
	public MemberVO execute(MemberVO vo) {

		if (vo.getAuthor().equals("ADMIN")) {
			MemberVO member = new MemberVO();
			dao = new MemberServiceImpl();

			System.out.println("조회할 아이디를 입력하세요:");
			member.setId(sc.nextLine());
			member = dao.memberSelect(member);
			if (member != null) {
				member.toString();
			} else {
				System.out.println("멤버조회에 실패했습니다.");
			}

		} else {
			System.out.println("멤버조회 권한이 없습니다.");
		}
		return null;
	}
}
