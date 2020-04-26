<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Clientes | Eventos</title>
<spring:url value="/clients/saveMerge" var="saveMerge"></spring:url>
<spring:url value="/clients/remove/" var="remove"></spring:url>
<spring:url value="/clients/mergeView/" var="mergeView"></spring:url>

<link href='<spring:url value="/resources/css/bootstrap.css" />'
	rel="stylesheet" />
<script src='<spring:url value="/resources/js/jquery-3.4.1.min.js" />'></script>
<script src='<spring:url value="/resources/js/bootstrap.js" />'></script>
</head>
<body>
	<div class="container">
		<c:if test="${not empty errorMessage}">
			<div id="divErrorMessage" class="alert alert-danger" role="alert">
				${errorMessage}</div>
		</c:if>
		<c:if test="${not empty successMessage}">
			<div id="divSuccessMessage" class="alert alert-success" role="alert">
				${successMessage}</div>
		</c:if>
		<jsp:include page="${request.contextPath}/menu"></jsp:include>

		<div class="pb-2 mt-4 mb-2 border-bottom">
			<h2>Cadastro - Clientes</h2>
		</div>

		<form:form action="${saveMerge}" modelAttribute="client"
			enctype="multipart/form-data" cssClass="mb-2">

			<form:hidden path="id" />

			<div class="form-group">
				<label>Nome</label>
				<form:input path="name" cssClass="form-control" />
			</div>
			
			<div class="form-group">
				<label>Data de Nascimento</label>
				<form:input type="date" path="birthdate" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label>E-mail</label>
				<form:input path="email" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label>Senha</label>
				<form:input path="password" cssClass="form-control" />
			</div>

			<input type="submit" class="btn btn-primary" name="saveMerge"
				value="${client.id == 0 ? 'Cadastrar' : 'Alterar'}" />

			<c:if test="${client.id ne 0}">
				<input type="submit" class="btn btn-warning" name="cancel"
					value="Cancelar" />
			</c:if>
		</form:form>
		<c:if test="${not empty clients}">
			<hr />
			<table class="table table-striped">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Nome</th>
						<th scope="col">Data de Nascimento</th>
						<th scope="col">E-mail</th>
						<th scope="col" colspan="2">Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="client" items="${clients}">
						<tr>
							<td>${client.id}</td>
							<td>${client.name}</td>
							<td>${client.email}</td>
							<fmt:parseDate value="${client.birthdate}" type="date" 
								pattern="yyyy-MM-dd" var="parsedDate" />
							<fmt:formatDate value="${parsedDate}" type="date" 
								pattern="dd/MM/yyyy" var="treatedDate" />
							<td>${treatedDate}</td>
							<td><a href="${mergeView}${client.id}"
								class="btn btn-warning">Alterar</a></td>
							<td><a href="${remove}${client.id}"
								class="btn btn-danger"
								onclick="return confirm('Deseja realmente deletar este(a) cliente?')">
									Deletar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#divErrorMessage').delay(5000).fadeOut('slow');
			$('#divSuccessMessage').delay(5000).fadeOut('slow');
		})
	</script>

</body>
</html>