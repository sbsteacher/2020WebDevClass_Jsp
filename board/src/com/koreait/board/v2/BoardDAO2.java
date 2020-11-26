package com.koreait.board.v2;

import java.util.ArrayList;
import java.util.List;
import com.koreait.board.BoardVO;

public class BoardDAO2 {
	private List<BoardDTO> list;	
	private static BoardDAO2 dao;
	
	//싱글톤 BoarDAO2 주소값 얻기 위한 스테틱 메소드
	public static BoardDAO2 getInstance() {
		if(dao == null) {
			dao = new BoardDAO2();
		}
		return dao;
	}
	
	private BoardDAO2() {
		list = new ArrayList();
		BoardDTO dto = new BoardDTO();
		dto.setI_board(1);
		dto.setTitle("타이틀");
		dto.setCtnt("내용");
		dto.setR_dt("11-25");
		
		list.add(dto);
	}
	
	public void insBoard(BoardDTO vo) {
		vo.setI_board(list.size() + 1);
		list.add(vo);
	}
	
	public List<BoardDTO> selBoardList() {
		return list;
	}
	
	public BoardDTO selBoard(int i_board) {
		for(BoardDTO dto : list) {
			if(dto.getI_board() == i_board) {
				return dto;
			}
		}
		return null;
	}
	
	public void delBoard(int i_board) {
		for(BoardDTO dto : list) {
			if(dto.getI_board() == i_board) {
				list.remove(dto);
				return;
			}
		}
	}
	
	public void modBoard(BoardDTO param) {
		for(BoardDTO dto : list) {
			if(dto.getI_board() == param.getI_board()) {
				dto.setTitle(param.getTitle());
				dto.setCtnt(param.getCtnt());
				return;
			}
		}
	}
}







