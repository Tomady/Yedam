package co.dy.prj.board.serviceImpl;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.command.Command;

public class BoardSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao;
	
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		dao = new BoardServiceImpl();
		
		System.out.println("조회할 글 번호를 입력하세요: ");
		board.setBID(sc.nextInt());
		sc.nextLine();
		board = dao.boardSelect(board);
		dao.boardHitup(board);
		
		System.out.println("글 번호: " + board.getBID());
		System.out.println("글 작성자: " + board.getBWriter());
		System.out.println("글 작성일: " + board.getBWriteDate());
		System.out.println("글 제목: " + board.getBTitle());
		System.out.println("글 내용: " + board.getBContents());
		System.out.println("글 조회수: " + board.getBHit());
		
	}
}
