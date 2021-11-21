package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberEditSave implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원 정보 수정 저장하기
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		String message;
		
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		member.setName(request.getParameter("name"));
		member.setTel(request.getParameter("tel"));
		member.setAddress(request.getParameter("address"));
		member.setAuthor(request.getParameter("author"));
		
		int n = memberDAO.memberUpdate(member);
		
		if(n != 0) {
			message = "회원수정을 성공적으로 되었습니다.";
		} else {
			message = "회원수정을 실패하였습니다. <br> 관리자에게 문의하세요.";
		}
		
		request.setAttribute("message", message);
		request.setAttribute("member", member);

		return "member/memberInfo";
	}

}
