package com.koreait.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	
	private List<BoardVO> list;
	
	private static BoardDAO dao;
	
	//싱글톤 BoarDAO 주소값 얻기 위한 스테틱 메소드
	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	
	private BoardDAO() {
		list = new ArrayList();
		list.add(new BoardVO(3, "반갑습니다.", "반가워요. 반갑습니다.", "11-20", "11-22"));
		list.add(new BoardVO(2, "Hello", "Hi, Nice to meet you", "10-20", "10-21"));
		list.add(new BoardVO(1, "안녕하세요", "내용입니다. 안녕하세요.", "10-12", "10-14"));
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
	
	public void insBoard(BoardVO vo) {
		list.add(vo);
	}
	
}


















