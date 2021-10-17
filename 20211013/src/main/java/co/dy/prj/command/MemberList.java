package co.dy.prj.command;

import java.util.ArrayList;
import java.util.List;

import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {
	List<MemberVO> list;
	MemberService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		if (vo.getAuthor().equals("ADMIN")) {
			list = new ArrayList<MemberVO>();
			dao = new MemberServiceImpl();
			list = dao.memberSelectList();

			for (MemberVO member : list) {
				member.toListString();
			}

		} else {
			System.out.println("멤버조회 권한이 없습니다.");
		}
		
		return null;
	}
}
