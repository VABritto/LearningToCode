<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Eventos | Eventos</title>

<spring:url value="/eventRegistration/saveMerge" var="saveMerge"></spring:url>
<spring:url value="/eventRegistration/remove/" var="remove"></spring:url>
<spring:url value="/eventRegistration/mergeView/" var="mergeView"></spring:url>

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
			<h2>Cadastro - Eventos</h2>
		</div>

		<form:form action="${saveMerge}" modelAttribute="event"
			enctype="multipart/form-data" cssClass="mb-2">

			<form:hidden path="id" />
						
			<div class="form-group">
				<label>Casa de Show</label> 
				<select name="concertHallId">
					<c:forEach var="concertHall" items="${concertHalls}">
						<option value="${concertHall.id}">${concertHall.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label>Nome</label>
				<form:input path="name" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label>Data Inicial</label>
				<form:input type="datetime-local" path="startDate" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label>Data Final</label>
				<form:input type="datetime-local" path="endDate" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label>Descrição</label>
				<form:input path="description" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label>Preço dos Tickets (R$)</label>
				<form:input path="ticketPrice" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label>Total de Tickets</label>
				<form:input path="totalTickets" cssClass="form-control" />
			</div>
			<div class="form-group">
				<div class="custom-file">
					<input type="file" name="image" class="custom-file-input"
						value="${event.encodedImage}" /> <label class="custom-file-label">Escolha
						uma imagem</label>
				</div>
			</div>

			<c:if test="${event.id ne 0}">
				<div class="mb-5">
					<img class="img-thumbnail"
						src="data:image/jpge;base64,${event.encodedImage}"
						alt="imagem não encontrada" />
				</div>
			</c:if>

			<input type="submit" class="btn btn-primary" name="saveMerge"
				value="${event.id == 0 ? 'Cadastrar' : 'Alterar'}" />

			<c:if test="${event.id ne 0}">
				<input type="submit" class="btn btn-warning" name="cancel"
					value="Cancelar" />
			</c:if>
		</form:form>
		<c:if test="${not empty events}">
			<hr />
			<table class="table table-striped">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Evento</th>
						<th scope="col">Casa de Show</th>
						<th scope="col">Data Inicial</th>
						<th scope="col">Data Final</th>
						<th scope="col">Preço de Tickets (R$)</th>
						<th scope="col">Total de Tickets</th>
						<th scope="col" colspan="2">Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="event" items="${events}">
						<tr>
							<td scope="row">${event.name}</td>
							<td>${event.concertHall.name}</td>
							<td>${event.startDate}</td>
							<td>${event.endDate}</td>
							<td>${event.ticketPrice}</td>
							<td>${event.totalTickets}</td>
							<td><a href="${mergeView}${event.id}"
								class="btn btn-warning">Alterar</a></td>
							<td><a href="${remove}${event.id}" class="btn btn-danger"
								onclick="return confirm('Deseja realmente deletar este evento?')">
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