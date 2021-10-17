package co.dy.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.dy.prj.command.Command;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;

public class MemberList implements Command {
	List<MemberVO> list;
	MemberService dao;

	@Override
	public void execute() {
		list = new ArrayList<MemberVO>();
		dao = new MemberServiceImpl();
		list = dao.memberSelectList();

		for (MemberVO vo : list) {
			System.out.print(vo.getId() + " : ");
			System.out.print(vo.getName() + " : ");
			System.out.print(vo.getPassword() + " : ");
			System.out.print(vo.getTel() + " : ");
			System.out.print(vo.getAddress() + " : ");
			System.out.println(vo.getAuthor());
		}
	}

}
