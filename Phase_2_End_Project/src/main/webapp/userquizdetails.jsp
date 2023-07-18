<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import="com.user.User" %>
<%@ page import="com.user.UserDAO" %>
<%@ page import="java.util.List" %>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Dashboard</h1>
    <table>
        <tr>
            <th>User ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Score</th>
        </tr>
        <% 
        UserDAO userDAO = new UserDAO();
        List<User> userList = userDAO.getAllUsers();
        if (userList != null) {
            for (User user : userList) { %>
                <tr>
                    <td><%= user.getId() %></td>
                    <td><%= user.getName() %></td>
                    <td><%= user.getEmail() %></td>
                    <td><%=  request.getAttribute("score")  %></td>
                </tr>
        <% } } %>
    </table>

</body>
</html>