package co.dy.prj.board.command;

import java.util.ArrayList;
import java.util.List;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;

public class BoardList implements Command {	//게시글 목록 보는 명령
	private List<BoardVO> list = new ArrayList<BoardVO>();
	
	@Override
	public void execute() {
		list = dao.boardSelectList();
		
		System.out.println("순번 : 작성자 : 작성일자 : 제목 : 조회수");
		for(BoardVO vo : list) {
			System.out.print(vo.getBID() + " ");
			System.out.print(vo.getBWriter()+ " ");
			System.out.print(vo.getBWriteDate()+ " ");
			System.out.print(vo.getBTitle()+ " ");
			System.out.println(vo.getBHit());
		}
	}
}
