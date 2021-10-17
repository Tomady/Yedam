package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		// 로그인된 member로 판단 USER ADMIN;
		// vo 로그인되어 있는 사람
		if (vo.getAuthor().equals("ADMIN")) { // if1
			MemberVO member = new MemberVO();
			dao = new MemberServiceImpl();

			System.out.println("삭제할 멤버의 id를 적으세요: ");
			member.setId(sc.nextLine());
			int n = dao.memberDelete(member);

			if (n != 0) { // if2
				System.out.println("성공적으로 삭제되었습니다.");
			} else {
				System.out.println("삭제 실패하였습니다.");
			} // if2 end

		} else {
			System.out.println("멤버삭제 권한이 없습니다.");
		} // if1 end

		return null;
	}
}
