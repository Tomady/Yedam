package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.member.service.MemberVO;

public class BoardDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		if (vo.getAuthor().equals("ADMIN")) {
			BoardVO board = new BoardVO();
			dao = new BoardServiceImpl();

			System.out.println("삭제할 글 번호를 입력하세요: ");
			board.setBId(sc.nextInt());
			sc.nextLine();

			int n = dao.boardDelete(board);
			if (n != 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("글 삭제를 실패하였습니다.");
			}
		} else {
			System.out.println("\'" + vo.getId() + "\'님은 게시글 삭제 권한이 없습니다.");
		}

		return null;
	}
}
