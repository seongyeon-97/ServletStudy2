<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MemberJoin Page</h1>
	
	<form action="./memberJoin.do" method="post">
		ID <input type="text" name="id"><br>
		PASSWORD <input type="password" name="password"><br>
		NAME <input type="text" name="name"><br>
		PHONE <input type="tel" name="phone"><br>
		E-MAIL <input type="email" name="email"><br>
		<button>JOIN</button>
	</form>
</body>
</html>