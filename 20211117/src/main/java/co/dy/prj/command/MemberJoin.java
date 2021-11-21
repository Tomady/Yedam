package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberJoin implements Command {
	private String message; 
	
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원가입 처리
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		member.setName(request.getParameter("name"));
		member.setTel(request.getParameter("tel"));
		member.setAddress(request.getParameter("address"));
		member.setAuthor("USER");
		
		int n = memberDAO.memberInsert(member);
		
		if(n != 0) {
			message = "회원가입이 성공적으로 되었습니다.";
		} else {
			message = "회원가입이 실패하였습니다. <br> 관리자에게 문의하세요.";
		}
		
		request.setAttribute("message", message);
				
		return "member/memberJoin";
	}
}
