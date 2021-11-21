package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class AjaxAuthorUpdate implements Command {
	private String result;
	
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원 권한 변경
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		
		member.setId(request.getParameter("id"));
		member.setAuthor(request.getParameter("author"));
		
		int n = memberDAO.memberAuthorUpdate(member);
		
		if(n != 0) {
			result = "yes";
		} else {
			result = "no";
		}
		
		return "ajax:" + result;
	}

}
