<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>	
	table, td, th {
		border-collapse: collapse;
		border: 1px solid #000;
	}
</style>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>no</th>
				<th>이름</th>
				<th>주소</th>
			</tr>			
			<tr>
				<td>1</td>
				<td>홍길동</td>
				<td>서울시</td>
			</tr>
			<tr>
				<td>2</td>
				<td>스미스</td>
				<td>미국</td>
			</tr>
			<tr>
				<td rowspan="2">3</td>
				<td>앙뚜앙</td>
				<td>프랑스</td>
			</tr>
			<tr>		
				<td colspan="2">빈칸</td>
			</tr>
		</table>
	</div>
</body>
</html>