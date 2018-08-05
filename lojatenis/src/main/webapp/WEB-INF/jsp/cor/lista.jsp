<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Cor</title>
</head>
<body>

	<a href="/cor/novo">Nova Cor</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cors}" var="cor">
				<tr>
					<td>
						<a href="/cor/visualizar/${cor.codigo}">${cor.codigo}</a>
					</td>
					<td>${cor.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>