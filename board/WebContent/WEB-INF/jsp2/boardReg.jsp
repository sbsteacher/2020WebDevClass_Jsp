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
		<form action="/v2/boardReg" method="post">
			<div>
				제목 : <input type="text" name="title">
			</div>
			<div>
				내용 : <textarea name="ctnt"></textarea>
			</div>
			<div>
				날짜 : <input type="date" name="r_dt">
			</div>
			<div>
				<input type="submit" value="글등록">
			</div>
		</form>
	</div>
</body>
</html>