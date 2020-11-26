package com.koreait.board.v2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v2/boardReg")
public class SerBoardReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utils.forward("boardReg", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String r_dt = request.getParameter("r_dt");
		
		System.out.println("title : " + title);
		System.out.println("ctnt : " + ctnt);
		System.out.println("r_dt : " + r_dt);
							
		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);
		dto.setCtnt(ctnt);
		dto.setR_dt(r_dt);
		
		BoardDAO2 dao2 = BoardDAO2.getInstance();
		dao2.insBoard(dto);
		
		response.sendRedirect("/v2/boardList");
	}

}













