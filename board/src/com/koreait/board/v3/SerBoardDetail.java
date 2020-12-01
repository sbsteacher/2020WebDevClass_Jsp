package com.koreait.board.v3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v3/bDetail")
public class SerBoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Utils3.getIntParam(request, "i_board"); 
		if(i_board == 0) {
			response.sendRedirect("/v3/bList");
			return;
		} 
		System.out.println("i_board : " + i_board);
				
		BoardDTO3 dto = BoardDAO3.selBoard(i_board);		
		request.setAttribute("item", dto);
		
		Utils3.forward("bDetail", request, response);
		
	}
	
}
