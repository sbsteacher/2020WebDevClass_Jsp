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
	<div>
		<div>
			<a href="/v2/boardReg"><button>글쓰기</button></a>
		</div>
		<div>
			<table>
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>작성일</td>
				</tr>
				
				<c:forEach items="${list}" var="item">
					<tr>
						<td>${item.i_board}</td>
						<td>
							<a href="/v2/boardDetail?i_board=${item.i_board}">
								${item.title}
							</a>
						</td>
						<td>${item.r_dt}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>











