package co.dy.prj.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
	private int bID;
	private String bWriter;
	private Date bWriteDate;
	private String bTitle;
	private String bContents;
	private int bHit;
}
