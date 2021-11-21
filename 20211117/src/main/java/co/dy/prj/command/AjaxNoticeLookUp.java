package co.dy.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.comm.Command;
import co.dy.prj.notice.service.NoticeService;
import co.dy.prj.notice.service.NoticeVO;
import co.dy.prj.notice.serviceImpl.NoticeServiceImpl;

public class AjaxNoticeLookUp implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 공지사항 세부조회
		NoticeService noticeDAO = new NoticeServiceImpl();
		NoticeVO notice = new NoticeVO();
		String result = null;
		
		notice.setNo(Integer.parseInt(request.getParameter("no")));
		notice = noticeDAO.noticeSelect(notice);
		
		if(notice != null) {
			System.out.println("notice not null");
			result = notice.getNo() + "," + 
					notice.getId() + "," + 
					notice.getName() + "," + 
					notice.getWdate() + "," +
					notice.getTitle() + "," +
					notice.getSubject() + "," +
					notice.getFileName() + "," +
					notice.getPfileName();
		} else {
			System.out.println("notice null");
			result = "no";
		}
		
		return "ajax:" + result;
	}
}
