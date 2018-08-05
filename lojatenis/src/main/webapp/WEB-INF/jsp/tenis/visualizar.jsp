<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Tênis</title>
</head>
<body>
	<form action="/tenis/alterar" method="post">
		<input type="hidden" name="codigo" value="${tenis.codigo}">
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>
		
		<a href="/tenis/listar">Cancelar</a> 
		<a href="/tenis/deletar/${tenis.codigo}">Deletar</a>

	</form>
</body>
</html>