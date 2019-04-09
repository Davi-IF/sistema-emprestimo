<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/main?acao=AdicionaCliente" var="link"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Cadastro de Cliente</h3>
	<form action="${link }" method="post">
		Nome
		<input type="text" name="nome"><br><br>
		Apelido
		<input type="text" name="apelido"><br><br>
		RG
		<input type="text" name="rg"><br><br>
		CPF
		<input type="text" name="cpf"><br><br>
		Idade
		<input type="number" min="18" max="99" name="idade"><br><br>
		
		<input type="submit">
	</form>

</body>
</html>