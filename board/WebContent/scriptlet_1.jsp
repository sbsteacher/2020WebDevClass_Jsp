<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String hello() {
		return "안녕하세요";
	
	}
%>    
<%
	//자바 문법을 사용할 수 있음.
	int n1 = 10;
	int n2 = 20;
	String name = "박도흠";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿</title>
</head>
<body>
	<div>n1 = <%=n1%> 	</div>
	<div>n2 = <%= n2 %> 	</div>
	<div>name = <% out.print(n1); %> </div>
	
	<div>hello = <%= hello() %></div>
</body>
</html>