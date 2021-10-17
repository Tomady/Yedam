package co.dy.prj;

import co.dy.prj.board.command.BoardList;
import co.dy.prj.board.command.BoardSelect;
import co.dy.prj.board.command.Command;
import co.dy.prj.comm.BoardMenu;

public class MainApp {

	public static void main(String[] args) {
		//게시판 프로젝트
//		BoardListCommand blist = new BoardListCommand();
//		blist.execute();
		
//		Command command = new BoardSelect();
//		command.execute();
		
		BoardMenu boardMenu = new BoardMenu();	//BoardMenu() 인스턴스생성
		boardMenu.run();
		
	}
}
