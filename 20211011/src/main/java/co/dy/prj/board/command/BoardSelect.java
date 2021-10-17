package co.dy.prj.board.command;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;

public class BoardSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		BoardVO board = new BoardVO();

		System.out.println("====================");
		System.out.println("조회할 글 번호를 입력하세요?");
		board.setBID(sc.nextInt()); // ?번글 가져오기
		sc.nextLine();
		board = dao.boardSelect(board);
		
		System.out.println("번호: " + board.getBID());
		System.out.println("작성자: " + board.getBWriter());
		System.out.println("작성일자: " + board.getBWriteDate());
		System.out.println("제목: " + board.getBTitle());
		System.out.println("내용: " + board.getBContents());
		System.out.println("조회수: " + board.getBHit());
		
//		sc.close();
	}
}
