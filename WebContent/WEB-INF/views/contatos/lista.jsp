<%@page import="java.text.SimpleDateFormat"%>
<%@page import="agenda.models.Contato"%>
<%@page import="java.util.List"%>
<%@page import="agenda.daos.ContatoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="../Menu.jsp"></c:import>
	<h1>Lista de contatos:</h1>

	<table border="2">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Endereço</th>
				<th>Data de Nascimento</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="contato" items="${contatos}">
				<tr>
					<td>${contato.nome }</td>
					<td>${contato.email }</td>
					<td>${contato.endereco }</td>
					<td>${contato.dataNascimento.time }</td>
					<td><a href="/agendaspring/contatos/remover?id=${contato.id}">Remover </a></td>
				</tr>
			</c:forEach>

		</tbody>

	</table>


</body>
</html>




