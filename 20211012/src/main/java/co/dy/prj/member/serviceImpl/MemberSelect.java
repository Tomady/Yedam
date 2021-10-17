package co.dy.prj.member.serviceImpl;

import java.util.Scanner;

import co.dy.prj.command.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;
	
	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		dao = new MemberServiceImpl();
		
		System.out.println("조회할 아이디를 입력하세요:");
		vo.setId(sc.nextLine());
		vo = dao.memberSelect(vo);
		System.out.println("아이디: " + vo.getId());
		System.out.println("이름: " + vo.getName());
		System.out.println("비밀번호: " + vo.getPassword());
		System.out.println("전화번호: " + vo.getTel());
		System.out.println("주소: " + vo.getAddress());
	}

}
