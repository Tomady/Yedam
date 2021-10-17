package co.dy.prj;

import java.util.ArrayList;
import java.util.List;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;
import co.dy.prj.menu.Menu;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Hello~~~~");
//		BoardService dao = new BoardServiceImpl(); // 서비스 호출
//		List<BoardVO> list = new ArrayList<BoardVO>();

//		list = dao.boardSelectList();
//		
//		for(BoardVO vo : list) {
//			System.out.println(vo.getBID() + " : " + vo.getBTitle());
//		}

//		BoardVO vo = new BoardVO();
//		vo.setBID(2);

//		vo = dao.boardSelect(vo);
//		System.out.println(vo.getBID());
//		System.out.println(vo.getBContents());

//		vo = new BoardVO();
//		vo.setBWriter("정도영");
//		vo.setBTitle("화요일 아침");
//		vo.setBContents("화요일 오전 수업중입니다.");
//		dao.boardInsert(vo);
//
//		vo = new BoardVO();
//		vo.setBWriter("관리자");
//		vo.setBTitle("마이바티스 테스트");
//		vo.setBContents("마이바티스는 sqlMapper로 dbms와 통신한다.");
//		int n = dao.boardInsert(vo);
//
//		if (n != 0) {
//			System.out.println("성공");
//		} else {
//			System.out.println("실패");
//		}
//
//		list = dao.boardSelectList();
//
//		for (BoardVO vo2 : list) {
//			System.out.println(vo2.getBID() + " : " + vo2.getBTitle());
//		}
		
//		MemberService dao = new MemberServiceImpl();
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		
//		list = dao.memberSelectList();
//		
//		for(MemberVO vo : list) {
//			System.out.println(vo.getId() + " : " + vo.getName());
//		}
//		
//		System.out.println("======================");
//		
//		BoardService bs = new BoardServiceImpl();
//		List<BoardVO> bList = new ArrayList<BoardVO>();
//		bList = bs.boardSelectList();
//		
//		for(BoardVO vo : bList) {
//			System.out.println(vo.getBID() + " : " + vo.getBTitle() + " : " + vo.getBWriter());
//		}
		
		Menu menu = new Menu();
		menu.run();
	}
}
