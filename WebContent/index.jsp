<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<STYLE type="text/css">
			.errorMessage {
				color: red;
			}
		</STYLE>
	</head>
	<body>
		<s:form action="register" method="post" validate="true">
			<s:textfield name="email" label="Enter Email Id"></s:textfield>
			<s:submit value="register"></s:submit>
		</s:form>
	</body>
</html>
