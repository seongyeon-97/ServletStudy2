<%@page import="com.sy.s1.bankbook.BankbookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankbookList Page 입니다!!</h1>
	<table>
		<tr>
			<th>일련변호</th><th>제품명</th><th>이자율</th>
		</tr>
	<%
		Object obj = request.getAttribute("list");
		ArrayList<BankbookDTO> ar = (ArrayList<BankbookDTO>)obj;
		for(BankbookDTO dto : ar){
	%>
		<tr>
			<td><%= dto.getBookNumber() %></td>
			<td><a href="./bankbookSelect.do?booknumber=<%=dto.getBookNumber()%>"><%= dto.getBookName() %></a></td>
			<td><%=dto.getBookRate() %></td>
		</tr>
		
	<%}%>
	</table>
	
</body>
</html>