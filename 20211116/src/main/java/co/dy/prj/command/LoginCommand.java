package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;
import oracle.net.ns.SessionAtts;

public class LoginCommand implements Command {
	
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();	// 세션객체 가져오기
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		
		vo = memberDAO.memberSelect(vo);
		
		String message = null;
		
		if(vo != null) {
			session.setAttribute("id", vo.getId());
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			message = vo.getName() + "님 환영합니다.";
		} else {
			message = "아이디 또는 패스워드가 틀립니다.";
		}
		
		request.setAttribute("message", message);	// 결과를 담아 보낼 때
		
		return "member/memberLogin";	// 보여줄 페이지
	}
}
