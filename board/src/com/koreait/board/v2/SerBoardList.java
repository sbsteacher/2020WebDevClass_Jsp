package com.koreait.board.v2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v2/boardList")
public class SerBoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//BoardDAO2 객체 주소값 얻어온다.    
    	BoardDAO2 dao2 = BoardDAO2.getInstance();
    	//selBoardList 메소드 호출하여 list주소값 얻어온다. 
    	List<BoardDTO> list = dao2.selBoardList();    	
    	//request에 "list"라는 키값으로 list주소값 집어 넣는다.
    	request.setAttribute("list", list);
    	Utils.forward("boardList", request, response);
	}
}
