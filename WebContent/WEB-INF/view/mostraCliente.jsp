<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Dados do cliente</h3>
	Nome: ${cliente.nome}<br>
	Apelido: ${cliente.apelido}<br>
	RG: ${cliente.rg}<br>
	CPF: ${cliente.cpf}<br>
	Idade: ${cliente.idade}<br>
	Saldo(Divida): R$ ${cliente.saldo}<br><br>
	
	<a href="/sistema-emprestimo/main?acao=ListaClientes">Voltar</a>

</body>
</html>