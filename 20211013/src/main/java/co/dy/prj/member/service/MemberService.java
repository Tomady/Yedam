package co.dy.prj.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	MemberVO memberLogin(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
}
