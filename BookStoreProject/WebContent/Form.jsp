<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>BOOK FORM</h1>
	<form action="../BookStoreProject/Book/register" method= "post">
Title <input type="text" name="title"/>
Author<input type="text" name="author"/>
</br>
Price<input type="text" name="price"/>
<input type="submit" value="Submit" />
</form>

</body>
</html>