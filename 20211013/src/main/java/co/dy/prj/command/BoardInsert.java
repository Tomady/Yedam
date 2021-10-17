package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.member.service.MemberVO;

public class BoardInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		BoardVO board = new BoardVO();
		dao = new BoardServiceImpl();
				
		board.setBWriter(vo.getName());
		System.out.println("글 제목을 입력하세요: ");
		board.setBTitle(sc.nextLine());
		System.out.println("글 내용을 입력하세요: ");
		board.setBContents(sc.nextLine());
		
		int n = dao.boardInsert(board);
		
		if(n != 0) {
			System.out.println("정상적으로 등록 되었습니다.");
		}else {
			System.out.println("등록 실패하였습니다.");
		}
		
		return null;
	}

}
