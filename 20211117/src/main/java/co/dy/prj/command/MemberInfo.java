package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberInfo implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원정보
		HttpSession session = request.getSession();
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		member.setId((String) session.getAttribute("id"));
		member = memberDAO.memberSelect(member);
		request.setAttribute("member", member);

		return "member/memberInfo";
	}

}
