<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align:center">
	    <a href="login">Login</a>
		<a href="register">Register</a>
		<a href="products/ALL">Products</a>
	</div>
	<h1>Hello ${nick}</h1>
	<ul>
		<c:forEach var="product" items="${products}">
			<c:if test="${product.category == 'koszulki' }">
				<li>${product.name}</li>
			</c:if>
		</c:forEach>
	</ul>
</body>
</html>
