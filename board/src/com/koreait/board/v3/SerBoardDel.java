package com.koreait.board.v3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v3/bDel")
public class SerBoardDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Utils3.getIntParam(request, "i_board");
		/*
		BoardDAO3 dao = BoardDAO3.getInstance();
		dao.delBoard(i_board);
		*/
		response.sendRedirect("/v3/bList");
		
	}
}
