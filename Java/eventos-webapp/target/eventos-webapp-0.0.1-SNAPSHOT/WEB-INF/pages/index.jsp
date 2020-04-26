<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tela Inicial | Eventos</title>

<link href='<spring:url value="/resources/css/bootstrap.css" />'
	rel="stylesheet" />
<script src='<spring:url value="/resources/js/jquery-3.4.1.min.js" />'></script>
<script src='<spring:url value="/resources/js/bootstrap.js" />'></script>
<style>
.card {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	max-width: 300px;
	margin: auto;
	text-align: center;
	font-family: arial;
}

.price {
	color: grey;
	font-size: 22px;
}

.card button {
	border: none;
	outline: 0;
	padding: 12px;
	color: white;
	background-color: #000;
	text-align: center;
	cursor: pointer;
	width: 100%;
	font-size: 18px;
}

.card button:hover {
	opacity: 0.7;
}
</style>
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
		<div class="col-lg-9 mt-5">
			<div class="row">
				<c:forEach var="event" items="${events}">
					<c:if test="${event.totalTickets > 0}">
						<div class="col-lg-4 col-md-6 mb-4">
							<div class="card">
								<div class="mb-5">
									<img class="img-thumbnail"
										src="data:image/jpge;base64,${event.encodedImage}"
										alt="imagem não encontrada" style="width: 100%" />
								</div>
								<h1>${event.name}</h1>
								<p class="price"> R$${Double.toString(event.ticketPrice).replace(".", ",")}</p>
								<p><b>Casa de Show:</b> ${event.concertHall.name}</p>
								<p>${event.description}</p>
								<p>
									<a href="eventDetails/id/${event.id}/"><button>Detalhes</button></a>
								</p>
							</div>
						</div>
					</c:if>
				</c:forEach>
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