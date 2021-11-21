package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberIdCheck implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 아이디 중복 체크(Ajax이용)
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		member.setId(request.getParameter("chkId"));
		
		boolean flag = memberDAO.memberIdCheck(member);	// true 존재, false 사용가능
		String chk = "0";
		
		if(flag) {	// id가 존재하면
			chk = "1";
		}
		
		return "ajax:" + chk;
	}

}
