package co.dy.prj.board.command;

import java.util.Scanner;

import co.dy.prj.board.service.BoardVO;

public class BoardDelete implements Command {
	private Scanner sc = new Scanner(System.in);

	@Override
	public void execute() {
		// 게시글 삭제
		BoardVO vo = new BoardVO();
		System.out.println("==================");
		System.out.println("삭제할 글 번호를 입력하세요?");
		vo.setBID(sc.nextInt()); // 삭제할 글 번호 입력
		sc.nextLine();

		int n = dao.boardDelete(vo);

		if (n != 0) {
			System.out.println("정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("게시글 삭제 실패입니다.");
		}

	}

}
