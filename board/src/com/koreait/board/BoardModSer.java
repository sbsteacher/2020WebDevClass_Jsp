package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardMod")
public class BoardModSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//jsp 화면 여는 용도
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");	
		System.out.println("i_board : " + strI_board);
		int i_board = Integer.parseInt(strI_board);
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = dao.selBoard(i_board);
		
		request.setAttribute("data", vo);
		
		String jsp = "/WEB-INF/jsp/boardMod.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	//수정 프로세스 실행
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String r_dt = request.getParameter("r_dt");
		
		BoardVO vo = new BoardVO(i_board, title, ctnt, r_dt, "11-25");
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.updBoard(vo);
		
		response.sendRedirect("/BoardDetail?i_board=" + strI_board);
	}

}











