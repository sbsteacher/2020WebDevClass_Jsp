<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<h1>보드 리스트2</h1>
	<div><a href="/BoardReg">글쓰기</a></div>
	<table>
		<tr>
			<th>No</th>
			<th>제목</th>			
		</tr>		
		<c:forEach items="${data}" var="item">
			<tr>
				<td>${item.i_board}</td>
				<td>
					<a href="/BoardDetail?i_board=${item.i_board}">
						${item.title }
					</a>
				</td>				
			</tr>
		</c:forEach>
	</table>
</body>
</html>








