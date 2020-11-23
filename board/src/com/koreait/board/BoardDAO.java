package com.koreait.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	
	private List<BoardVO> list;
	
	private static BoardDAO dao;	
	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	private BoardDAO() {
		list = new ArrayList();
		list.add(new BoardVO(1, "안녕하세요", "내용입니다. 안녕하세요.", "10-12", "10-12"));
		list.add(new BoardVO(2, "Hello", "Hi, Nice to meet you", "10-20", "10-20"));
		list.add(new BoardVO(3, "반갑습니다.", "반가워요. 반갑습니다.", "11-20", "11-20"));
	}
	
	public List<BoardVO> selBoardList() {
		return list;
	}
	
	
	public BoardVO selBoard(int i_board) {
		for(BoardVO vo : list) {
			if(vo.getI_board() == i_board) {
				return vo;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
}
