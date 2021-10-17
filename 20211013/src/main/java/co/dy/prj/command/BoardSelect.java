package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.member.service.MemberVO;

public class BoardSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		BoardVO board = new BoardVO();
		dao = new BoardServiceImpl();

		System.out.println("조회할 글 번호를 입력하세요: ");
		board.setBId(sc.nextInt());
		sc.nextLine();
		board = dao.boardSelect(board);

		if (board != null) {
			board.toString();
		} else {
			System.out.println("없는 글번호입니다.");
		}

		return null;
	}

}
