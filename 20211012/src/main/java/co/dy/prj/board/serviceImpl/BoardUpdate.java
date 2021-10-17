package co.dy.prj.board.serviceImpl;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.command.Command;

public class BoardUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao;

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		dao = new BoardServiceImpl();

		System.out.println("수정할 글 번호를 입력하세요: ");
		vo.setBID(sc.nextInt());
		sc.nextLine();
		System.out.println("변경할 글 내용을 입력하세요: ");
		vo.setBContents(sc.nextLine());

		int n = dao.boardUpdate(vo);

		if (n != 0) {
			System.out.println("정상적으로 변경이 되었습니다.");
		} else {
			System.out.println("글 수정 실패하였습니다.");
		}
	}

}
