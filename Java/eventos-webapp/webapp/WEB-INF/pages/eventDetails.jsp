<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalhe do Evento | Eventos</title>

<spring:url value="/eventDetails/buyTickets/" var="buyTickets"></spring:url>
<spring:url value="/" var="home"></spring:url>

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
		<c:if test="${not empty soldOutMessage}">
			<div id="divSoldOutMessage" class="alert alert-danger" role="alert">
				${soldOutMessage}</div>
		</c:if>
		<jsp:include page="${request.contextPath}/menu"></jsp:include>

		<form:hidden path="id" />

		<div class="row">

			<div class="col-lg-4 col-md-6 mb-4">
				<img class="img-thumbnail"
					src="data:image/jpge;base64,${event.encodedImage}"
					alt="imagem não encontrada" style="width: 100%" />

			</div>
			<div class="col-lg-4 col-md-6 mb-4">
				<h2>${event.name}</h2>
				<p>
					<b>Casa de Show:</b> ${event.concertHall.name}
				</p>
				<br /> <b>Descrição:</b>
				<p>${event.description}</p>
				<br />
				<p>
					<b>Data Inicial:</b> ${event.startDate}
				</p> 
				<br />
				<p>
					<b>Data Final:</b> ${event.endDate}
				</p> 
				<br />
				<p class="price">
					<b>Preço:</b> R$${Double.toString(event.ticketPrice).replace(".",
					",")}
				</p>
				<p>
					<b>Ingressos restantes:</b> ${event.totalTickets}
				</p>
				<form:form action="${buyTickets}${event.id}" modelAttribute="event"
					enctype="multipart/form-data" cssClass="mb-2">
					<div class="form-group">
						<label>Quantidade de ingressos desejados: </label>
						<div>
						<input type="number" name="tickets" min="0" max="4" required/>
						</div> <br />
						<input type="submit" class="btn btn-primary" name="buyTickets"
				value="Comprar" />
					</div>
				</form:form>
				
				<div id="formFooter"> <br />
			<a href="${home}"><input type="submit" class="btn btn-warning"
				value="Voltar" /></a>
			</div>
			</div>

		</div>

	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#divErrorMessage').delay(5000).fadeOut('slow');
			$('#divSuccessMessage').delay(5000).fadeOut('slow');
		})
	</script>
</body>
</html>