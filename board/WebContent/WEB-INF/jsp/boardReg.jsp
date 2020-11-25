<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글등록</title>
</head>
<body>
	<div>
		<h1>글등록</h1>
		<form action="/BoardReg" method="post">
			<div>
				글번호 : <input type="number" name="i_board">
			</div>
			<div>
				제목 : <input type="text" name="title">
			</div>
			<div>
				내용 : <textarea name="ctnt"></textarea>
			</div>
			<div>
				<input type="submit" value="글등록">
				<input type="reset" value="다시쓰기">
			</div>
		</form>
	</div>
</body>
</html>