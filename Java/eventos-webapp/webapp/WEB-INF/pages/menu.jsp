<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
<spring:url value="/" var="home"></spring:url>
<spring:url value="/logout" var="logout"></spring:url>
<spring:url value="/login" var="login"></spring:url>
<spring:url value="/signUpView" var="signUp"></spring:url>
<spring:url value="/concertHall" var="concertHall"></spring:url>
<spring:url value="/eventRegistration" var="eventRegistration"></spring:url>


</head>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${home}">Eventos</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${home}">Home</a></li>
				<c:if test="${loggedInUser.getAuthorities().stream().findFirst().get().toString() == 'ROLE_OWNER'}">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown">Cadastros <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${concertHall}">Cadastro de
								Casas de Show</a></li>
						<li><a href="${eventRegistration}">Cadastro
								de Eventos</a></li>
					</ul></li>
				</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="nav-item">
					<a class="nav-link" href="#">${loggedInUser.name == 'anonymousUser' ? '' : loggedInUser.name}</a>
				</li>
				
				<li class="nav-item">
				
					<c:if test="${loggedInUser.name ne 'anonymousUser' }">
						<li><a class="nav-link" href="${logout}" >
							<span class="glyphicon glyphicon-log-out"></span>Sair</a></li>
					</c:if>
					<c:if test="${loggedInUser.name eq 'anonymousUser' }">
						<li><a class="nav-link" href="${signUp}"><span class="glyphicon glyphicon-user"></span> Cadastrar-se</a></li>
					</c:if>
					<c:if test="${loggedInUser.name eq 'anonymousUser' }">
						<li><a class="nav-link" href="${login}"><span class="glyphicon glyphicon-log-in"></span> Entrar</a></li>
					</c:if>
				</li>
			</ul>
		</div>
	</div>
</nav>
</html>
