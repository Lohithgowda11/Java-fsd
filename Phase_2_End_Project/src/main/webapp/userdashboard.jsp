<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <style>
        
        
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
        
        h2 {
            text-align: left;
        }
        h1{
        text-align: left;
        }
        
        .welcome-message {
            text-align: left;
            margin-bottom: 20px;
        }
        
        .action-link {
            display: block;
            margin: 0 auto 10px;
            text-align: left;
        }
        
        .logout-form {
            text-align: left;
        }
    </style>

</head>
<body>
<div class="container">
    <h1>Online Quiz Portal</h1>
        <h2>Welcome to the User Dashboard</h2>
        <p class="welcome-message">Welcome, <%= session.getAttribute("name") %>!</p>
        <button class="action-link" onclick="window.location.href='sqlTestServlet'">Take SQL Test</button>
    </div>

</body>
</html>