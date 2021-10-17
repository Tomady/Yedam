package co.dy.prj.member.serviceImpl;

import java.util.Scanner;

import co.dy.prj.command.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;

public class MemberInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		dao = new MemberServiceImpl();

		// id, name, password, tel, address
		System.out.println("아이디를 입력하세요: ");
		vo.setId(sc.nextLine());
		System.out.println("이름을 입력하세요: ");
		vo.setName(sc.nextLine());
		System.out.println("비밀번호를 입력하세요: ");
		vo.setPassword(sc.nextLine());
		System.out.println("전화번호를 입력하세요: ");
		vo.setTel(sc.nextLine());
		System.out.println("주소를 입력하세요: ");
		vo.setAddress(sc.nextLine());

		int n = dao.memberInsert(vo);

		if (n != 0) {
			System.out.println("성공적으로 등록되었습니다.");
		} else {
			System.out.println("등록 실패하였습니다");
		}
	}

}
