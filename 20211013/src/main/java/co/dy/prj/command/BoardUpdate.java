package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.member.service.MemberVO;

public class BoardUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao;

	@Override
	public MemberVO execute(MemberVO vo) {
		BoardVO board = new BoardVO();
		dao = new BoardServiceImpl();

		System.out.println("수정할 글 번호를 입력하세요: ");
		board.setBId(sc.nextInt());
		sc.nextLine();

		board = dao.boardSelect(board);

		// 보드 작성자랑 일치하는지 조회
		if (vo.getName().equals(board.getBWriter())) {
			System.out.println("변경할 글 내용을 입력하세요: ");
			board.setBContents(sc.nextLine());

			int n = dao.boardUpdate(board);

			if (n != 0) {
				System.out.println("정상적으로 변경이 되었습니다.");
			} else {
				System.out.println("글 수정 실패하였습니다.");
			}
		} else {
			System.out.println("글 수정 권한이 없습니다.");
		}

		return null;
	}

}
