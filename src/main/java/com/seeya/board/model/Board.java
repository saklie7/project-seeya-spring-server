package com.seeya.board.model;

import lombok.Data;

@Data
public class Board {
	private long bno;
	private String writer;
	private String title;
	private String content;
	private String regDate;
	private long hitCnt;

}
