<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up | Eventos</title>

<spring:url value="/doSignUp" var="doSignUp"></spring:url>
<spring:url value="/" var="home"></spring:url>

<link href='<spring:url value="/resources/css/bootstrap.css" />'
	rel="stylesheet" />
<script src='<spring:url value="/resources/js/jquery-3.4.1.min.js" />'></script>
<script src='<spring:url value="/resources/js/bootstrap.js" />'></script>

</head>
<body>
	<div class="container">
		<div id="formContent">
			<c:if test="${not empty errorMessage}">
				<div id="divErrorMessage" class="alert alert-danger" role="alert">
					${errorMessage}</div>
			</c:if>

			<jsp:include page="${request.contextPath}/menu"></jsp:include>

			<h2>Eventos - Novo Usuário</h2>

			<form:form action="${doSignUp}" modelAttribute="client">
				<div class="form-group">
					<label>Nome</label> <input type="text" class="form-control"
						name="name" value="${client.name}"  required/>
				</div>
				<br />
				<div class="form-group">
					<label>E-mail</label> <input type="text" class="form-control"
						name="email" value="${client.email}"  required/>
				</div>
				<br />
				<div class="form-group">
					<label>Senha</label> <input type="text" class="form-control"
						maxlength="20" name="password" value="${client.password}" required />
				</div>
				<br />
				<div class="form-group">
					<label>Data de Nascimento</label> <input type="date"
						class="form-control" name="birthdate" value="${client.birthdate}" required />
				</div>
				<br />
				<div class="form-group">
					<form:radiobutton path="role" id="user" name="role" value="user" checked="checked" />
					<label for="user">Cliente</label><br />
					<form:radiobutton path="role" id="owner" name="role" value="owner" />
					<label for="owner">Dono de Estabelecimento</label><br />
				</div>
				<br />

				<input type="submit" class="btn btn-success" value="Cadastrar" />

			</form:form>
			<div id="formFooter"> <br />
			<a href="${home}"><input type="submit" class="btn btn-warning"
				value="Voltar" /></a>
			</div>
		</div>
	</div>
</body>
</html>