package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {
	private String message;
	
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 모델을 호출해서 결과를 처리함.
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		HttpSession session = request.getSession();
		
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		
		member = memberDAO.memberSelect(member);
		
		if(member != null) {
			session.setAttribute("id", member.getId());
			session.setAttribute("author", member.getAuthor());
			session.setAttribute("name", member.getName());
			message = member.getName() + "님 환영합니다.";
		} else {
			message = "아이디 또는 패스워드가 틀립니다.";
		}
		
		request.setAttribute("message", message);
		
		return "member/memberLogin";
	}
}
