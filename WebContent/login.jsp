<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 导入struts2标签库 -->
<%@taglib prefix="s" uri="/struts-tags" %>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基于struts2的登录系统应用</title>
</head>
<body>
<hr>
<s:form action="login" method="post">
	<s:textfield name="userName" label="用户名" size="24"/>
	<br>
	<s:password name="password" label="密码" size="24"/>
	<s:submit value="登录"></s:submit>
</s:form>
<hr>
</body>
</html>