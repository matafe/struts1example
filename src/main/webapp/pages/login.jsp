<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
</head>
<body>
	<h1>Struts html:text example</h1>

	<html:form action="/Login">

		<html:messages id="err_name" property="user.username.err">
			<div style="color: red">
				<bean:write name="err_name" />
			</div>
		</html:messages>

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<bean:message key="label.user.username" />
				:
			</div>

			<html:text property="username" size="20" maxlength="20" />
		</div>

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<html:submit>
					<bean:message key="label.button.submit" />
				</html:submit>
			</div>
			<html:reset>
				<bean:message key="label.button.reset" />
			</html:reset>
		</div>

	</html:form>

</body>
</html>