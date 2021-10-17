package co.dy.prj.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;

public class BoardList implements Command{
	private BoardService boardService;
	List<BoardVO> boards;
	
	@Override
	public MemberVO execute(MemberVO vo) {
		boards = new ArrayList<BoardVO>();
		boardService = new BoardServiceImpl();
		boards = boardService.boardSelectList();

		System.out.println("====공지사항 목록===");
		
		for(BoardVO board : boards) {
			board.toListString();
		}

		System.out.println("====공지사항 목록 끝===");
		
		return null;
	}

}
