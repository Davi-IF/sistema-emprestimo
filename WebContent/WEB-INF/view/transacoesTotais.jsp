<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Lista de Transações</h3>
	Saldo Plutolomeu: ${saldo }  
	<ul>
	
		<c:forEach items="${ transacoes}" var="transacao" >
		
			<li>
				<b>Cliente:</b> ${transacao.clienteNome}
				- <b>Valor:</b> ${transacao.valor }
				- <b>Tipo de Transação:</b> ${transacao.tipo}<br>
			</li>
		
		</c:forEach>
	
	</ul>
	<br>
	<a href="/sistema-emprestimo/main?acao=ListaClientes">Voltar</a>
</body>
</html>