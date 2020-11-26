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
		<form action="/v2/boardMod" method="post">
			<div>
				글번호 : <input type="text" name="i_board" value="${item.i_board}" readonly>
			</div>
			<div>
				제목 : <input type="text" name="title" value="${item.title}">
			</div>
			<div>
				내용 : <textarea name="ctnt">${item.ctnt}</textarea>
			</div>
			<div>
				날짜 : <input type="date" name="r_dt" value="${item.r_dt}">
			</div>
			<div>
				<input type="submit" value="글수정">
			</div>
		</form>
	</div>
</body>
</html>