package com.koreait.board.v2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v2/boardDetail")
public class SerBoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Utils.getIntParam(request, "i_board"); 
		if(i_board == 0) {
			response.sendRedirect("/v2/boardList");
			return;
		} 
		System.out.println("i_board : " + i_board);
		
		BoardDAO2 dao2 = BoardDAO2.getInstance();
		BoardDTO dto = dao2.selBoard(i_board);
		
		request.setAttribute("item", dto);
		
		Utils.forward("boardDetail", request, response);
		
	}
	
}
