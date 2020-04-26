<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Entrar | Eventos</title>

	<spring:url value="/process" var="process"></spring:url>
	<spring:url value="/signUpView" var="signUpView"></spring:url>
	
	<link href='<spring:url value="/resources/css/bootstrap.css" />' rel="stylesheet" />
	<link href='<spring:url value="/resources/css/login.css" />' rel="stylesheet" />
    <script src='<spring:url value="/resources/js/jquery-3.4.1.min.js" />' ></script> 
    <script src='<spring:url value="/resources/js/bootstrap.js" />' ></script>
</head>
<body>
	<div class="wrapper fadeInDown">
		<div id="formContent">
			<c:if test="${not empty errorMessage}">
				<div id="divErrorMessage" class="alert alert-danger" role="alert">
				${errorMessage}
				</div>
			</c:if>		
			<div class="fadeIn first">
				<h2>Eventos</h2>			
			</div>
			
			<form:form action="${process}">
				<input type="text" name="username" id="login" class="fadeIn second" placeholder="e-mail" />
				<input type="text" name="password" id="password" class="fadeIn third"  placeholder="senha" />
				<input type="submit" class="fadeIn fourth" value="Logar" />
				<p>
					<a href="${signUpView}" class="btn btn-success">Cadastrar-se</a>
				</p>
			</form:form>
				
			<div id="formFooter">
				<a class="underlineHover" href="#">Esqueceu sua senha?</a>
			</div>
		</div>	
	</div>
</body>
</html>