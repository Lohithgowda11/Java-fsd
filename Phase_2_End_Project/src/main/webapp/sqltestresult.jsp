<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    ><%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SQL Test Result</h1>
    <p>Your score: <%= request.getAttribute("score") %></p>
    <a href="userdashboard.jsp">Back to Dashboard</a>

</body>
</html>