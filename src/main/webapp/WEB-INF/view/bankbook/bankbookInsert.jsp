<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankbookInsert Page</h1>
	
	<form action="./bankbookInsert.do" method="post">
		제품명 <input type="text" name="bookName" placeholder="ex) 청약저축"><br>
		이자율 <input type="text" name="bookRate"><br>
		판매여부 Y <input type="radio" name="bookSale" checked="checked" value="1"> N <input type="radio" name="bookSale" value="0"><br>
<!-- 			<select>
				<option>Y</option>
				<option>N</option>				
			</select> -->
		<div>
			<button type="submit">WRITE</button>
			<input type="button" value="WRITE2">
			<input type="submit"> 
			<input type="reset">
		</div>
	</form>
</body>
</html>