<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Tênis</title>
</head>
<body>

	<a href="/tenis/novo">Novo Tênis</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Marca</th>
				<th>Cor</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${teniss}" var="tenis">
				<tr>
					<td><a href="/tenis/visualizar/${tenis.codigo}">${tenis.codigo}</a>
					</td>
					<td>${tenis.nome}</td>
					<td>${tenis.marca.nome}</td>
					<td>${tenis.cor.nome}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>