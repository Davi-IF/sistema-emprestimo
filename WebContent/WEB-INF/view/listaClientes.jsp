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
	
	<h3>Lista de Clientes</h3>
	Saldo Plutolomeu: ${saldo }  
	<ul>
	
	<c:forEach items="${clientes }" var="cliente">

		<li>
			${cliente.apelido} - R$ ${cliente.saldo} 
			<a href="/sistema-emprestimo/main?acao=MostraCliente&id=${cliente.clienteId}&jsp=mostraCliente.jsp" >Detalhes</a>
			<a href="/sistema-emprestimo/main?acao=MostraCliente&id=${cliente.clienteId}&jsp=formAlteraCliente.jsp" >Altera</a>
			<a href="/sistema-emprestimo/main?acao=MostraCliente&id=${cliente.clienteId}&jsp=formEmprestaDinheiro.jsp" >Emprestar</a>
			<a href="/sistema-emprestimo/main?acao=MostraCliente&id=${cliente.clienteId}&jsp=formRecebeDinheiro.jsp" >Receber</a>
			<a href="/sistema-emprestimo/main?acao=MostraCliente&id=${cliente.clienteId}&jsp=transacoesCliente.jsp" >Ver transações</a>
			<a href="/sistema-emprestimo/main?acao=MatarCliente&id=${cliente.clienteId}" >Matar</a>
		</li>
	
	</c:forEach>
	
	</ul>

	<a href="/sistema-emprestimo/main?acao=ApagarRegistros" >Apagar tudo</a><br>
	<a href="/sistema-emprestimo/main?acao=TodasTransacoes" >Todas as transações</a><br>
	<a href="/sistema-emprestimo/main?acao=AdicionaSaldo">Adicionar saldo</a><br>
	<a href="/sistema-emprestimo/main?acao=AdicionaCliente" >Adicionar novo cliente</a><br>
</body>
</html>