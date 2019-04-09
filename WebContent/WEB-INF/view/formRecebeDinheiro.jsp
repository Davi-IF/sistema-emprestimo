<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/main?acao=RecebeDinheiro" var="link"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Olá, ${cliente.apelido}</h3>
	Digite a quantia que deseja pegar devolver<br>
	Divida: R$ ${cliente.saldo }
	<form action="${link }" method="post">
		Valor
		<input type="number" min="1" max="${cliente.saldo}" name="valor">
		<input type="hidden" value="${ cliente.clienteId}" name="id">
		<input type="submit">
	</form>
	
</body>
</html>