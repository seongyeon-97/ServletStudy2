<%@page import="com.sy.s1.bankbook.BankbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankbooknSelect Page 입니다</h1>
	
		
	<h3>num : ${requestScope.dto.bookNumber}</h3>
	<h3>Name : ${requestScope.dto.bookName}</h3>
	<h3>Rate : ${requestScope.dto.bookRate}</h3>
	<h3>Count : ${requestScope.count}</h3>
	<h3>Name : ${requestScope.name}</h3>
	<h3>Session : ${sessionScope.se}</h3>
	<h3>Session : ${se}</h3>
	
	
</body>
</html>