package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// memberList 
		MemberService memberDAO = new MemberServiceImpl();
		request.setAttribute("members", memberDAO.memberSelectList());
		
		return "member/memberList";
	}

}
