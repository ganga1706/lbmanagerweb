<%@ include file="header.jsp"%>
<div class="container">
		<form:form action="/register" modelAttribute="userRequest"
			method="POST">
			<table>
				<tr>
					<td><form:label path="userName">user name:</form:label></td>
					<td><form:input path="userName" /> <br /></td>
				</tr>
				<tr>
					<td><form:label path="phNumber">Phone number:</form:label></td>
					<td><form:input path="phNumber" /> <br /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password:</form:label></td>
					<td><form:password path="password" /> <br /></td>
				</tr>
				<tr>
					<td><form:label path="email">E-mail:</form:label></td>
					<td><form:input path="email" /> <br /></td>
				</tr>



				<%-- <form:label path="birthday">Birthday (yyyy-mm-dd):</form:label>
            <form:input path="birthday"/><br/>
             
            <form:label path="gender">Gender:</form:label>
            <form:radiobutton path="gender" value="Male"/>Male
            <form:radiobutton path="gender" value="Female"/>Female<br/>
              --%>
				<%-- <form:label path="phNumber"></form:label>
            <form:select path="profession" items="${professionList}" /><br/> --%>



				<%--             <form:label path="note">Note:</form:label>
            <form:textarea path="note" cols="25" rows="5"/><br/> --%>
			</table>
			<form:button>Register</form:button>
		</form:form>
	</div>
<%@ include file="footer.jsp"%>

