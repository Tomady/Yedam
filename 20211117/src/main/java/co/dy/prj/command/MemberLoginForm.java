package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;

public class MemberLoginForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 폼 호출
		return "member/memberLoginForm";
	}

}
