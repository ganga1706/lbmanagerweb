<%@ include file="header.jsp"%>
<div class="container">
	<form:form action="login" method="post" modelAttribute="loginRequest">
		<fieldset>
			<div class="form-group">
				<label class="col-form-label" for=userName>UserName:</label>
				<form:input path="userName" class="form-control" />
				<form:errors path="userName" class="form-control" />
				<br />
			</div>
			<div class="form-group" >
				<label class="col-form-label" for="password">Password:</label>
				<form:password path="password" class="form-control" />
				<form:errors path="password" class="form-control" />
			</div>
		</fieldset>
		<input type="submit" value="login" class="btn btn-primary" />
	</form:form>
</div>
<%@ include file="footer.jsp"%>