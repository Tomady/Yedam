package co.dy.prj.board.command;

import co.dy.prj.board.service.BoardService;
import co.dy.prj.board.serviceImpl.BoardServiceImpl;
import co.dy.prj.mybatis.BoardMybatisService;

public interface Command {
	public BoardService dao = new BoardServiceImpl();
//	public BoardService dao = new BoardMybatisService();

	void execute();
}
