<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label for="nome"> Nome: </label>
<input type="text" name="nome" id="nome" value="${tenis.nome}">
<form:errors path="tenis.nome" />


<label for="marca">Marca</label>
<select id="marca" name="marca.codigo">
	<c:forEach items="${marcas}" var="marca">
		<c:set var="selecionado" value="" />
		<c:if test="${marca.codigo eq tenis.marca.codigo}">
			<c:set var="selecionado" value="selected" />
		</c:if>
		<option value="${marca.codigo}" ${selecionado}>${marca.nome}
	</c:forEach>

</select>
	<label for="cor">Cor</label>
	<select id="cor" name="cor.codigo">
		<c:forEach items="${cors}" var="cor">
			<c:set var="selecionado" value="" />
			<c:if test="${cor.codigo eq tenis.cor.codigo}">
				<c:set var="selecionado" value="selected" />
			</c:if>
			<option value="${cor.codigo}" ${selecionado}>${cor.nome}
		</c:forEach>
</select>