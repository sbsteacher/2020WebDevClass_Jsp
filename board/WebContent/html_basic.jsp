<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 주석!!! -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Hello</title>
		<link rel="stylesheet" type="text/css" href="common.css">
		<style>
			/* 태그 선택자 */
			div {
				background-color: yellow;	
			}
			
			span { 
			
			}
			
			/* 클래스 선택자 */
			.span2 {
				color: blue;
			}
			
			
			/* 아이디 선택자 */
			#div3 {
				color: green;
			}
		</style>
	</head>
	<body>
		<div>
			<a href="img.jsp">img 가기</a>
		</div>
		<!-- in-line 태그 -->
		<span style="color:red;">안녕하세요.</span>
		<span class="span2">안녕하세요.</span>
		
		<br>
		<!-- block 태그 -->
		<div class="span2">안녕하세요.</div>
		<div id="div2" class="span2">안녕하세요.</div>
		<div id="div3" class="span2">dddd</div>
	</body>
</html>



