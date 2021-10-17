package co.dy.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.command.Command;

public class BoardList implements Command {
	private BoardService boardService;
	List<BoardVO> boards;
	
	@Override
	public void execute() {
		boards = new ArrayList<BoardVO>();
		boardService = new BoardServiceImpl();
		boards = boardService.boardSelectList();

		System.out.println("====공지사항 목록===");
		for(BoardVO vo : boards) {
			System.out.print(vo.getBID() + " : ");
			System.out.print(vo.getBWriter() + " : ");
			System.out.print(vo.getBWriteDate() + " : ");
			System.out.print(vo.getBTitle() + " : ");
			System.out.println(vo.getBHit());
		}

		System.out.println("====공지사항 목록 끝===");
	}

}
