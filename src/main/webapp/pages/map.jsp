<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
</head>
<body>
	<h1>Struts Map Example</h1>

	<html:form action="/Map">

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				Entre com os valores:
				:
			</div>
			<br>
			<html:text property="newValues(mauricio)" size="20" maxlength="20" />
			<br>
			<html:text property="newValues(sabrina)" size="20" maxlength="20" />
		</div>

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<html:submit>
					<bean:message key="label.button.submit" />
				</html:submit>
			</div>
		</div>

	</html:form>

</body>
</html>