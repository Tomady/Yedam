package co.dy.prj.command;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dy.prj.comm.Command;
import co.dy.prj.notice.service.NoticeService;
import co.dy.prj.notice.service.NoticeVO;
import co.dy.prj.notice.serviceImpl.NoticeServiceImpl;

public class NoticeResister implements Command {
	private String filePath = "C:\\FileTest"; // 파일이 저장되는 절대경로
	private int fileSize = 1024 * 1024 * 100; // 파일 최대 사이즈 100MB
	private int n = 0;

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 공지사항 저장
		NoticeService noticeDAO = new NoticeServiceImpl();
		NoticeVO notice = new NoticeVO();
		HttpSession session = request.getSession();

		notice.setId((String) session.getAttribute("id")); // 세션에 저장된 아이디 값
		notice.setName((String) session.getAttribute("name")); // 세션에 저장된 이름 값

		try {
			MultipartRequest multi = new MultipartRequest(request, filePath, fileSize, "UTF-8",
					new DefaultFileRenamePolicy()); // 객체 생성시 파일이 전송됨.
			// filename은 중복이름이 들어올 경우 자동으로 index가 있는 물리 파일명
			String fileName = multi.getFilesystemName("fileName");
			System.out.println("물리파일명: " + fileName);
			// index되기 전의 원본명
			String orgFile = multi.getOriginalFileName("fileName"); // 폼에서 넘어오는 파일이름(원본 파일명)
			System.out.println("원본파일명: " + orgFile);

			fileName = filePath + File.separator + fileName; // File.separator는 '\'를 말한다. 저장경로를 포함해서 만듦.
			System.out.println("물리파일명2: " + fileName);

			if (orgFile != null) { // 첨부파일이 존재할 때
				notice.setFileName(orgFile); // 원본
				notice.setPfileName(fileName); // 물리파일명
			} else { // 첨부파일이 존재하지 않을 때
				notice.setFileName(""); // 원본
				notice.setPfileName(""); // 물리파일명
			}

			notice.setWdate(Date.valueOf(multi.getParameter("wdate"))); // form에서 넘어오는 값들은 전부 String이다.
			notice.setTitle(multi.getParameter("title"));
			notice.setSubject(multi.getParameter("subject"));

			n = noticeDAO.noticeInsert(notice);

			if (n != 0) {
				System.out.println("db입력 성공");
			} else {
				System.out.println("db입력 실패");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "noticeList.do";
	}

}
