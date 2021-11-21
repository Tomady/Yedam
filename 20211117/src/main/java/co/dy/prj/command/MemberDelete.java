package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberDelete implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회월탈퇴
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		HttpSession session = request.getSession();
		
		member.setId(request.getParameter("id"));
		
		int n = memberDAO.memberDelete(member);
		
		if(n != 0) {
			System.out.println("삭제완료");
			session.invalidate();
		} else {
			System.out.println("삭제실패");
		}
		
		return "home/home";
	}

}
