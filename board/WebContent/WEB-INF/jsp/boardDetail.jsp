<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.koreait.board.BoardVO" %>    
<%
	BoardVO ddd = (BoardVO)request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<h1>디테일 페이지</h1>
	<div>${ddd.title }</div>
	<div>
		작성일 : <%=ddd.getR_dt() %>
	</div>
	<div>
		수정일 : <%=ddd.getM_dt() %>
	</div>
	<div>
		<%=ddd.getCtnt() %>
	</div>
</body>
</html>