<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수정</title>
</head>
<body>
	<div>
		<h1>글수정</h1>
		<form action="/BoardMod" method="post">
			<div>
				<input type="hidden" name="i_board" value="${data.i_board}">
				<input type="hidden" name="r_dt" value="${data.r_dt }">
			</div>
			<div>
				제목 : <input type="text" name="title" value="${data.title }">
			</div>
			<div>
				내용 : <textarea name="ctnt">${data.ctnt }</textarea>
			</div>
			<div>
				<input type="submit" value="글수정">
				<input type="reset" value="다시쓰기">
			</div>
		</form>
	</div>
</body>
</html>