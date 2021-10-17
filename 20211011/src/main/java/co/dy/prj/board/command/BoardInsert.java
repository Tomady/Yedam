package co.dy.prj.board.command;

import java.sql.Date;
import java.util.Scanner;

import co.dy.prj.board.service.BoardVO;

public class BoardInsert implements Command {
	// dao 객체는 인터페이스에서 상속 받아서 상용한다.
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		// 게시글 추가
		BoardVO vo = new BoardVO();
		System.out.println("==================");
		System.out.println("작성자를 입력하세요?");
		vo.setBWriter(sc.nextLine());
//		vo.setbWriteDate(Date.valueOf("2021-10-11"));
		System.out.println("제목을 입력하세요?");
		vo.setBTitle(sc.nextLine());
		System.out.println("내용을 입력하세요?");
		vo.setBContents(sc.nextLine());
		
		int n = dao.boardInsert(vo);
		
		if (n != 0) {
			System.out.println("정상적으로 등록 되었습니다.");
		} else {
			System.out.println("등록 실패했습니다.");
		}
		
//		sc.close();
	}
}
