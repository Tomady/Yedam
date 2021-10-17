package co.dy.prj.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int bId;
	private String bWriter;
	private Date bWriteDate;
	private String bTitle;
	private String bContents;
	private int bHit;
	private String name;	//member에서 바뀐 이름 저장
	
	public void toListString() {
		System.out.print(bId + " : ");
		System.out.print(bWriter + " : ");
		System.out.print(bWriteDate + " : ");
		System.out.print(bTitle + " : ");
		System.out.println(bHit);
	}
	
	public String toString() {
		System.out.println("글번호: " + bId);
		System.out.println("작성자: " + bWriter);
		System.out.println("작성일자: " + bWriteDate);
		System.out.println("글제목: " + bTitle);
		System.out.println("내용: " + bContents);
		System.out.println("조회수: " + bHit);
		return null;
	}
}
