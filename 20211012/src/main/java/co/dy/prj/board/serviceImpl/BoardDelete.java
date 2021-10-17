package co.dy.prj.board.serviceImpl;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.command.Command;

public class BoardDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao;

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		dao = new BoardServiceImpl();

		System.out.println("삭제할 글 번호를 입력하세요: ");
		vo.setBID(sc.nextInt());
		sc.nextLine();

		int n = dao.boardDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("글 삭제를 실패하였습니다.");
		}
	}
}
