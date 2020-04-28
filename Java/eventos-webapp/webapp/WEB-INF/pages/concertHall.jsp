<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Casas de Show | Eventos</title>

<spring:url value="/concertHall/saveMerge" var="saveMerge"></spring:url>
<spring:url value="/concertHall/remove/" var="remove"></spring:url>
<spring:url value="/concertHall/mergeView/" var="mergeView"></spring:url>

<link href='<spring:url value="/resources/css/bootstrap.css" />'
	rel="stylesheet" />
<script src='<spring:url value="/resources/js/jquery-3.4.1.min.js" />'></script>
<script src='<spring:url value="/resources/js/bootstrap.js" />'></script>
</head>
<body>
<div class="container">
		<c:if test="${not empty errorMessage}">
			<div id="divErrorMessage" class="alert alert-danger" role="alert">
				${errorMessage}
			</div>
		</c:if>
		<c:if test="${not empty successMessage}">
			<div id="divSuccessMessage" class="alert alert-success" role="alert">
				${successMessage}
			</div>
		</c:if>
		<jsp:include page="${request.contextPath}/menu"></jsp:include>
		
		<div class="pb-2 mt-4 mb-2 border-bottom">
			<h2>Cadastro - Casas de Show</h2>
		</div>
		
		<form:form action="${saveMerge}" modelAttribute="concertHall" 
		enctype="multipart/form-data" cssClass="mb-2">
		
			<form:hidden path="id"/>
			<form:hidden path="concertHallImage"/>
			
			<div class="form-group">
				<label>Nome</label>
				<form:input path="name" cssClass="form-control"/>
			</div>
			<div class="form-group">
				<label>Endereço</label>
				<form:input path="address" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Capacidade</label>
				<form:input path="capacity" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<div class="custom-file">
					<input type="file" name="image" class="custom-file-input" 
					value="${concertHallImage}" />
					<label class="custom-file-label">Escolha uma imagem</label>
				</div>
			</div>
			
			<c:if test="${concertHall.id ne 0}">
				<div class="mb-5">
					<img class="img-thumbnail" src="data:image/jpge;base64,${concertHallImage}" 
					alt="imagem não encontrada" />
				</div>
			</c:if>
			
			<input type="submit" class="btn btn-primary" name="saveMerge" 
			value="${concertHall.id == 0 ? 'Cadastrar' : 'Alterar'}"/>
			
			<c:if test="${concertHall.id ne 0}">
				<input type="submit" class="btn btn-warning" name="cancel" value="Cancelar" /> 
			</c:if>
		</form:form>
		<c:if test="${not empty concertHalls}">
			<hr />
			<table class="table table-striped">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Nome</th>
						<th scope="col">Endereço</th>
						<th scope="col">Capacidade</th>
						<th scope="col" colspan="2">Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="concertHall" items="${concertHalls}">
						<tr>
							<td scope="row">${concertHall.id}</td>
							<td>${concertHall.name}</td>
							<td>${concertHall.address}</td>
							<td>${concertHall.capacity}</td>
							<td><a href="${mergeView}${concertHall.id}" 
								class="btn btn-warning">Alterar</a></td>
							<td><a href="${remove}${concertHall.id}"
								class="btn btn-danger" 
								onclick="return confirm('Deseja realmente deletar esta casa de show?')">
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