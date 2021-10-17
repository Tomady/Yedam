package co.dy.prj;

import co.dy.prj.exe.MainMenu;

//import java.util.ArrayList;
//import java.util.List;
//
//import co.dy.prj.service.MemberService;
//import co.dy.prj.service.MemberVO;
//import co.dy.prj.serviceImpl.MemberServiceImpl;

public class MainApp {
	public static void main(String[] args) {
//		DataSource dao = DataSource.GetInstance();	//싱글톤 dao
//		dao.getConnection();	//

//		MemberService memberService = new MemberServiceImpl();
//		List<MemberVO> members = new ArrayList();

		// 한명 데이터 조회 select * from member where id = ?";
//		MemberVO vo = new MemberVO();
//		vo.setId("dy");
//		vo = memberService.selectMember(vo);
//		vo.toString();

//		System.out.println("==========================");

		// insert into member values(?, ?, ?, ?, ?, ?);
//		vo = new MemberVO();
//		vo.setId("kim");
//		vo.setPassword("4567");
//		vo.setName("김치국");
//		vo.setTel(null);
//		vo.setAddress(null);
//		vo.setAuthor("USER");
//		int n = memberService.insertMember(vo);
//
//		if (n != 0) {
//			System.out.println("잘 입력되었습니다.");
//		} else {
//			System.out.println("입력 실패하였습니다.");
//		}

//		System.out.println("==========================");

		// select * from member;
//		members = memberService.selectMemberList();
		
		// 출력
//		for (MemberVO member : members) {
//			member.toString();
//		}
		MainMenu mainMenu = new MainMenu();
		mainMenu.run();
	}
}
