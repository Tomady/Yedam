package co.dy.prj.member.serviceImpl;

import java.util.Scanner;

import co.dy.prj.command.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		MemberVO vo = new MemberVO();
		dao = new MemberServiceImpl();
		
		System.out.println("삭제할 멤버의 id를 적으세요: ");
		vo.setId(sc.nextLine());
		int n = dao.memberDelete(vo);

		if (n != 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제 실패하였습니다.");
		}
	}
}
