package com.island.app.page.vo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageVo {

	public PageVo(int listCount , int currentPage, int pageLimit, int boardLimit) {
		this.listCount = listCount;
		this.currentPage = currentPage;
		this.pageLimit = pageLimit;
		this.boardLimit = boardLimit;

		this.maxPage =    (int) Math.ceil((double)listCount / boardLimit);
		this.startPage = (currentPage-1) / pageLimit * pageLimit + 1;
		this.endPage = startPage + pageLimit - 1;//max페이지에 따라서 페이징 수 만들어 주는 코드임..
		if(endPage > maxPage) {
			endPage = maxPage;
		}

		this.beginRow = boardLimit * (currentPage-1) + 1; 
		this.lastRow = beginRow + boardLimit - 1;
	}


	private int listCount;
	private int currentPage;
	private int pageLimit;
	private int boardLimit;

	private int startPage;
	private int endPage;
	private int maxPage;

	private int beginRow;
	private int lastRow;


}
