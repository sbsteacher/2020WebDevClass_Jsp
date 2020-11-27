package com.koreait.board.v3;

import java.util.ArrayList;
import java.util.List;
import com.koreait.board.BoardVO;

public class BoardDAO3 {
	private List<BoardDTO3> list = new ArrayList();
	private static BoardDAO3 dao;

	public static BoardDAO3 getInstance() {
		if(dao == null) {
			dao = new BoardDAO3();
		}
		return dao;
	}
	
	private BoardDAO3() {}
	
	public void insBoard(BoardDTO3 vo) {
		vo.setI_board(list.size() + 1);
		list.add(vo);
	}
	
	public List<BoardDTO3> selBoardList() {
		return list;
	}
	
	public BoardDTO3 selBoard(int i_board) {
		for(BoardDTO3 dto : list) {
			if(dto.getI_board() == i_board) {
				return dto;
			}
		}
		return null;
	}
	
	public void delBoard(int i_board) {
		for(BoardDTO3 dto : list) {
			if(dto.getI_board() == i_board) {
				list.remove(dto);
				return;
			}
		}
	}
	
	public void modBoard(BoardDTO3 param) {
		for(BoardDTO3 dto : list) {
			if(dto.getI_board() == param.getI_board()) {
				dto.setTitle(param.getTitle());
				dto.setCtnt(param.getCtnt());
				return;
			}
		}
	}
}







