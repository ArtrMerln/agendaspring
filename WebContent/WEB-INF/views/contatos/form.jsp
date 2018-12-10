<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title>furmularioo</title>

</head>
<body>
<h1> adicionar contato </h1>

<form action="/agendaspring/contatos"> 




	
		<div>
			<label>Nome: </label> 
			<input type="text" name="nome">
		</div>
		<div>
			<label>Email: </label> 
			<input type="text" name="email">
		</div>
		<div>
			<label>Endereço: </label> 
			<input type="text" name="endereco">
		</div>
		<div>
			<label>Data de Nascimento: </label>
			<input type="text" name="dataNascimento">
		</div>
		<div>
			<button type="submit">Adicionar</button>
		</div>
	</form>










</body>
</html>