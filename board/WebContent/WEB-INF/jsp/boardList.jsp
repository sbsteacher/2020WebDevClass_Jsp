<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.koreait.board.BoardVO" %>    
<%
	List<BoardVO> data = (List<BoardVO>)request.getAttribute("data");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<h1>보드 리스트</h1>
	<table>
		<tr>
			<th>No</th>
			<th>제목</th>			
		</tr>		
		<% for(BoardVO vo : data) { %>
			<tr>
				<td><%=vo.getI_board() %></td>
				<td>
					<a href="/BoardDetail?i_board=<%=vo.getI_board()%>">
						<%=vo.getTitle() %>
					</a>
				</td>				
			</tr>
		<% } %>
	</table>
</body>
</html>








