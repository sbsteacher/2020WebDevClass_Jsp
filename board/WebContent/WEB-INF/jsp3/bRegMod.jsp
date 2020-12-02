<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>
<c:if test="${param.i_board == 0}">
글등록
</c:if>
<c:if test="${param.i_board > 0}">
글수정
</c:if>
</title>
</head>
<body>
	<div>		
		<div style="color:red;">${msg}</div>
	
		<form action="/v3/bRegMod" method="post" id="frm" onsubmit="return chk();">
			<div>
				글번호 : <input type="text" name="i_board" value="${param.i_board}" readonly>
			</div>
			<div>
				제목 : <input type="text" name="title" value="${item.title}">
			</div>
			<div>
				내용 : <textarea name="ctnt">${item.ctnt}</textarea>
			</div>		
			<div>
				<c:if test="${param.i_board == 0}">
					<input type="submit" value="글등록">
				</c:if>
				<c:if test="${param.i_board > 0}">
					<input type="submit" value="글수정">
				</c:if>
				
			</div>
		</form>
	</div>
	<script>
		function chk() {
			var frm = document.querySelector('#frm');			
			console.log(frm.i_board.value);
			return false;
		}
	</script>
</body>
</html>






