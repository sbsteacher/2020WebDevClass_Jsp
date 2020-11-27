<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<div>
		<a href="/v3/bList">리스트</a>
		<a href="/v3/bDel?i_board=${item.i_board}">
			삭제
		</a>
		<a href="/v3/bRegMod?i_board=${item.i_board}">
			수정
		</a>
	</div>
	<div>
		<div>번호 : ${item.i_board}</div>
		<div>제목 : ${item.title }</div>
		<div>내용 : ${item.ctnt }</div>
		<div>제목 : ${item.r_dt }</div>
	</div>
</body>
</html>