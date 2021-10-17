package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		// member 등록
		if (vo.getAuthor().equals("ADMIN")) {
			MemberVO member = new MemberVO();
			dao = new MemberServiceImpl();

			// id, name, password, tel, address
			System.out.println("아이디를 입력하세요: ");
			member.setId(sc.nextLine());
			System.out.println("이름을 입력하세요: ");
			member.setName(sc.nextLine());
			System.out.println("비밀번호를 입력하세요: ");
			member.setPassword(sc.nextLine());
			System.out.println("전화번호를 입력하세요: ");
			member.setTel(sc.nextLine());
			System.out.println("주소를 입력하세요: ");
			member.setAddress(sc.nextLine());

			int n = dao.memberInsert(member);

			if (n != 0) {
				System.out.println("성공적으로 등록되었습니다.");
			} else {
				System.out.println("등록 실패하였습니다");
			}
			
		} else {
			System.out.println("멤버등록 권한이 없습니다.");
		}

		return null;
	}

}
