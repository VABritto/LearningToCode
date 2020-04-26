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

<link href='<spring:url value="/resources/css/bootstrap.css" />' rel="stylesheet" />
<script src='<spring:url value="/resources/js/jquery-3.4.1.min.js" />' ></script> 
<script src='<spring:url value="/resources/js/bootstrap.js" />' ></script>
<style>
.hide {
  display: none;
}
</style>
</head>
<body>
	<div class="container">
		<div id="formContent">
			<c:if test="${not empty errorMessage}">
				<div id="divErrorMessage" class="alert alert-danger" role="alert">
					${errorMessage}
				</div>
			</c:if>		
			<div class="fadeIn first">
				<h2>Eventos - Novo Usuário</h2>
			</div>
			
			<form:form action="${doSignUp}" modelAttribute="client">
				<div class="form-group">
					<label>Nome</label>
					<input type="text" class="form-control" name="name" value="${client.name}" />
				</div>
				<div class="form-group">
					<label>E-mail</label>
					<input type="text" class="form-control" name="email" value="${client.email}" />
				</div>
				<div class="form-group">
					<label>Senha</label>
					<input type="text" class="form-control" maxlength="20" name="password"
						value="${client.password}" />
				</div>
				<div class="form-group">
					<label>Data de Nascimento</label>
					<input type="date" class="form-control" name="birthdate" 
						value="${client.birthdate}" />
				</div>
				<div class="form-group">
					<input type="radio" id="user" name="role" value="${client.role}" onClick="show1();" />
					<label for="user">user</label><br />
					<input type="radio" id="owner" name="role" value="${client.role}" onClick="show2();" />
					<label for="owner">owner</label><br />
				</div>
				<div id="halls" class="hide">
					<h2>Testing</h2>
				</div>
				
				<input type="submit" class="btn btn-success" value="Cadastrar" />
			</form:form>
		</div>
	</div>
<script type="text/javascript">
function show1(){
	  document.getElementById('halls').style.display ='none';
	}
	function show2(){
	  document.getElementById('halls').style.display = 'block';
	}
</script>
</body>
</html>