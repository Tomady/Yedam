package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;
import co.dy.prj.notice.service.NoticeService;
import co.dy.prj.notice.serviceImpl.NoticeServiceImpl;

public class NoticeList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 공지사항 목록보기
		NoticeService noticeDAO = new NoticeServiceImpl();
		request.setAttribute("notices", noticeDAO.noticeSelectList());
		
		return "notice/noticeList";
	}
}
