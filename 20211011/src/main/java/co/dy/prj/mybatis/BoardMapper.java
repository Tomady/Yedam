package co.dy.prj.mybatis;

import java.util.List;

import co.dy.prj.board.service.BoardVO;

public interface BoardMapper {
	List<BoardVO> boardSelectList(); // 전체목록 가져오기
	BoardVO boardSelect(BoardVO board); // 한개글 조회
	int boardInsert(BoardVO board); // 게시글 등록
	int boardUpdate(BoardVO board); // 게시글 수정
	int boardDelete(BoardVO board); // 게시글 삭제
}
