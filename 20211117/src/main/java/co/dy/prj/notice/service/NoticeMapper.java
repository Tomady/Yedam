package co.dy.prj.notice.service;

import java.util.List;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	List<NoticeVO> noticeSearchList(String searchKey);	// 내용을 위한 것.
}
