package com.koreait.board.v3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board.v2.BoardDAO2;
import com.koreait.board.v2.BoardDTO;
import com.koreait.board.v2.Utils;

@WebServlet("/v3/bRegMod")
public class SerBoardRegMod extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Utils3.getIntParam(request, "i_board");
		
		System.out.println("i_board : " + i_board);
		if(i_board > 0) { //수정
			/*
			BoardDAO3 dao = BoardDAO3.getInstance();
			BoardDTO3 dto = dao.selBoard(i_board);
			request.setAttribute("item", dto);
			*/
		}
		
		Utils3.forward("bRegMod", request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Utils.getIntParam(request, "i_board");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String r_dt = request.getParameter("r_dt");
		
		BoardDTO3 dto = new BoardDTO3();
		dto.setTitle(title);
		dto.setCtnt(ctnt);
		dto.setR_dt(r_dt);
					
		int result = 0;
		if(i_board > 0) {
			dto.setI_board(i_board);
		} else {
			result = BoardDAO3.insBoard(dto);
		}		
				
		response.sendRedirect("/v3/bDetail?i_board=" + i_board);
	}

}



