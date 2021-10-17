package co.dy.prj.command;

import java.util.Scanner;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.service.BoardVO;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.member.service.MemberService;
import co.dy.prj.member.service.MemberVO;
import co.dy.prj.member.serviceImpl.MemberServiceImpl;

public class MemberUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberDao;
	private BoardService boardDao;

	@Override
	public MemberVO execute(MemberVO vo) {
		MemberVO member = new MemberVO();
		BoardVO board = new BoardVO();
		memberDao = new MemberServiceImpl();
		boardDao = new BoardServiceImpl();

		// 자기자신만 업데이트
		if (vo.getAuthor().equals("ADMIN")) {
			System.out.println("수정할 아이디를 입력하세요");
			member.setId(sc.nextLine());
			System.out.println("변경할 이름을 입력하세요");
			member.setName(sc.nextLine());
			System.out.println("변경할 패스워드를 입력하세요");
			member.setPassword(sc.nextLine());
			System.out.println("변경할 전화번호를 입력하세요");
			member.setTel(sc.nextLine());
			System.out.println("변경할 주소를 입력하세요");
			member.setAddress(sc.nextLine());
			System.out.println("변경할 직위를 입력하세요");
			member.setAuthor(sc.nextLine());
			
		} else {
			member.setId(vo.getId());
			System.out.println("변경할 이름을 입력하세요");
			member.setName(sc.nextLine());
			System.out.println("변경할 패스워드를 입력하세요");
			member.setPassword(sc.nextLine());
			System.out.println("변경할 전화번호를 입력하세요");
			member.setTel(sc.nextLine());
			System.out.println("변경할 주소를 입력하세요");
			member.setAddress(sc.nextLine());
			member.setAuthor("USER");
		}

		int n = memberDao.memberUpdate(member);
		
		if (n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("수정 실패했습니다.");
		}
		
		member = memberDao.memberSelect(member);

//		System.out.println("로그인된 이름: " + vo.getName());
//		System.out.println("수정된 이름: " + member.getName());
		
		//member 이름 update되서 이름 바꼈을 경우, board에 있는 이름 다 변경
		if(!vo.getName().equals(member.getName())) {
			board.setName(member.getName());
			board.setBWriter(vo.getName());
			int m = boardDao.boardUpdateName(board);
			
			vo.setName(member.getName());
			
			if (m != 0) {
				System.out.println("정상적으로 board name 수정되었습니다.");
			} else {
				System.out.println("작성한 글이 없습니다.");
			}
		}

		return null;
	}

}
