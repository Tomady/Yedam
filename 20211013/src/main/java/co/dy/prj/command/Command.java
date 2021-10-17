package co.dy.prj.command;

import co.dy.prj.member.service.MemberVO;

public interface Command {
	public MemberVO execute(MemberVO vo);
}
