<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Tenis</title>
</head>
<body>
	<form action="/cor/alterar" method="post">
		<input type="hidden" name="codigo" value="${cor.codigo}">
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>

		<a href="/cor/listar">Cancelar</a> 
		<a href="/cor/deletar/${cor.codigo}">Deletar</a>
	</form>
</body>
</html>