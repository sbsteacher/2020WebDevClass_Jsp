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
				
		int result = BoardDAO3.delBoard(i_board);
		
		if(result == 0) {
			response.sendRedirect("/v3/bList?err=del");
			return;
		}
		
		response.sendRedirect("/v3/bList");
		
	}
}
