package co.dy.prj.member.serviceImpl;

import java.util.Scanner;

import co.dy.prj.command.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao;
	
	//#{name}, password = #{password}, tel = #{tel}, addresss = #{address}, author = #{author} 
	
	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		dao = new MemberServiceImpl();
		
		System.out.println("수정할 아이디를 입력하세요");
		vo.setId(sc.nextLine());
		System.out.println("변경할 이름을 입력하세요");
		vo.setName(sc.nextLine());
		System.out.println("변경할 패스워드를 입력하세요");
		vo.setPassword(sc.nextLine());
		System.out.println("변경할 전화번호를 입력하세요");
		vo.setTel(sc.nextLine());
		System.out.println("변경할 주소를 입력하세요");
		vo.setAddress(sc.nextLine());
		System.out.println("변경할 직위를 입력하세요");
		vo.setAuthor(sc.nextLine());
	}

}
