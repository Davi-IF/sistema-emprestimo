<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="main?acao=AdicionaSaldo" var="link"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Saldo inicial</h3>

	<form action="${link }" method="post">
		Por favor, digite um valor:
		<input type="number" min="1" name="saldo">
		<br><input type="submit">
	</form>	

</body>
</html>