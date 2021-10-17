package co.dy.prj.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.dy.prj.command.BoardDelete;
import co.dy.prj.command.BoardInsert;
import co.dy.prj.command.BoardList;
import co.dy.prj.command.BoardSelect;
import co.dy.prj.command.BoardUpdate;
import co.dy.prj.command.Command;
import co.dy.prj.command.MemberDelete;
import co.dy.prj.command.MemberInsert;
import co.dy.prj.command.MemberList;
import co.dy.prj.command.MemberLogin;
import co.dy.prj.command.MemberSelect;
import co.dy.prj.command.MemberUpdate;
import co.dy.prj.member.service.MemberVO;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();
	MemberVO loginInfo = new MemberVO();	//현재 로그인 된 멤버 저장.
	//id:hong, name:홍길동, password:1234, tel:null address:null author:user
	//id:null, name:null, password:null

	public Menu() { // 생성될 때 명령 실행그룹 map 구조 만들기
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardInsert", new BoardInsert());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardDelete", new BoardDelete());
		map.put("memberList", new MemberList());
		map.put("memberSelect", new MemberSelect());
		map.put("memberInsert", new MemberInsert());
		map.put("memberUpdate", new MemberUpdate());
		map.put("memberDelete", new MemberDelete());
		map.put("memberLogin", new MemberLogin());
	}

	private void loginTitle() {
		System.out.println("=================");
		System.out.println("===== 로 그 인 ====");
		System.out.println("=================");
	}

	private void mainTitle() {
		System.out.println("=================");
		System.out.println("===1. 멤버 관리 ===");
		System.out.println("===2. 공지 관리 ===");
		System.out.println("===3. 종    료 ===");
		System.out.println("=================");
		System.out.println("원하는 작업을 선택하세요.");
	}

	private void memberTitle() {
		System.out.println("==================");
		System.out.println("===1.회원목록 조회 ===");
		System.out.println("===2.회원정보 조회 ===");
		System.out.println("===3.회원정보 등록 ===");
		System.out.println("===4.회원정보 수정 ===");
		System.out.println("===5.회원정보 삭제 ===");
		System.out.println("===6.메인메뉴 가기 ===");
		System.out.println("==================");
		System.out.println("원하는 작업을 선택하세요.");
	}

	private void boardTitle() {
		System.out.println("==================");
		System.out.println("===1.공지사항 목록 ===");
		System.out.println("===2.공지사항 조회 ===");
		System.out.println("===3.공지사항 등록 ===");
		System.out.println("===4.공지사항 수정 ===");
		System.out.println("===5.공지사항 삭제 ===");
		System.out.println("===6.메인메뉴 가기 ===");
		System.out.println("==================");
		System.out.println("원하는 작업을 선택하세요.");
	}

	private void menu() {
		loginTitle();
		loginInfo = executeRun("memberLogin", loginInfo);
		
		while (true) {
			mainTitle();

			int jobNo = sc.nextInt();
			sc.nextLine();	//버퍼에 있는 엔터값 제거.

			if (jobNo == 1) {
				memberMangement();
				continue;
			} else if (jobNo == 2) {
				boardMangement();
				continue;
			} else {
				System.out.println("Good bye~~~");
				sc.close();
				return;
			}
		}
	}

	private void boardMangement() {
		boolean b = false;
		do {
			boardTitle();
			int key = sc.nextInt();

			switch (key) {
			case 1:
				executeRun("boardList", loginInfo);
				break;
			case 2:
				executeRun("boardSelect", loginInfo);
				break;
			case 3:
				executeRun("boardInsert", loginInfo);
				break;
			case 4:
				executeRun("boardUpdate", loginInfo);
				break;
			case 5:
				executeRun("boardDelete", loginInfo);
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);
	}

	private void memberMangement() {
		boolean b = false;
		
		do {
			memberTitle();
			int key = sc.nextInt();
			sc.nextLine();

			switch (key) {
			case 1:
				executeRun("memberList", loginInfo);
				break;
			case 2:
				executeRun("memberSelect", loginInfo);
				break;
			case 3:
				executeRun("memberInsert", loginInfo);
				break;
			case 4:
				executeRun("memberUpdate", loginInfo);
				break;
			case 5:
				executeRun("memberDelete", loginInfo);
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);
	}

//	private void executeRun(String string) {
//		// 실행할 명령을 구현한다.
//		Command command = map.get(string);
//		command.execute();
//	}

	private MemberVO executeRun(String string, MemberVO vo) {
		Command command = map.get(string);	//인스턴스생성

		if (string.equals("memberLogin")) {
			loginInfo = command.execute(vo);
		} else {
			command.execute(vo);	//
		}

		return loginInfo;
	}

	public void run() {
		menu();
	}
}