<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Olá ${cliente.apelido }</h3> 
	Essas são suas transações<br>
	<ul>
		
		<c:forEach items="${cliente.transacoes }" var="transacao">
			<li>
				<b>Valor:</b> R$ ${transacao.valor }
				<b>Tipo de Transação:</b> ${transacao.tipo }
			</li>
		</c:forEach>
	</ul>
	Seu Saldo: R$ ${cliente.saldo} <br>
	
	<a href="/sistema-emprestimo/main?acao=ListaClientes">Voltar</a>
</body>
</html>