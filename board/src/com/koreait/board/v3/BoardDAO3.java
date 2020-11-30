package com.koreait.board.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO3 {
	
	public static int insBoard(BoardDTO3 vo) {
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_board "
				+ " ( title, ctnt ) "
				+ " VALUES "
				+ " ( ?, ? ) ";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setNString(1, vo.getTitle());
			ps.setNString(2, vo.getCtnt());
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps);
		}
		
		return result;
	}
	
	public static List<BoardDTO3> selBoardList() {
		List<BoardDTO3> list = new ArrayList();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM t_board ORDER BY i_board DESC ";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int i_board = rs.getInt("i_board");
				String title = rs.getNString("title");
				String ctnt = rs.getNString("ctnt");
				String r_dt = rs.getString("r_dt");
				
				BoardDTO3 dto = new BoardDTO3();
				dto.setI_board(i_board);
				dto.setTitle(title);
				dto.setCtnt(ctnt);
				dto.setR_dt(r_dt);
				
				list.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps, rs);
		}
		
		return list;
	}
	
	public BoardDTO3 selBoard(int i_board) {
		
		return null;
	}
	
	public void delBoard(int i_board) {
		
	}
	
	public void modBoard(BoardDTO3 param) {
		
	}
}







