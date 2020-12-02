package com.koreait.board.v3;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v3/bList")
public class SerBoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
    	String err = request.getParameter("err");
    	if(err != null) {
    		switch(err) {
    			case "del":
    			request.setAttribute("msg", "삭제 실패하였습니다.");
    			break;
    		}
    	}
    	
    	List<BoardDTO3> list = BoardDAO3.selBoardList();
    	request.setAttribute("list", list);
    	
    	Utils3.forward("bList", request, response);
	}
}
