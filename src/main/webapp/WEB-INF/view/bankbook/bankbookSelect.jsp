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
	
	<% 
		//session
		//application
		//page
		
		String num	 = request.getParameter("booknumber");
		Object obj = request.getAttribute("dto");
		BankbookDTO bankbookDTO = (BankbookDTO)obj;
	%>
	
	<h3>num : <%= num %></h3>
	<h3>Name = <%= bankbookDTO.getBookName() %></h3>
	<h3>Rate = <%= bankbookDTO.getBookRate() %></h3>
	
</body>
</html>