<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
    body {
        display: flex;
        justify-content: left;
        align-items: left;
        height: 100vh;
    }
    h1 {
            margin-top: 50px;
        }

    h2 {
        text-align: left;
    }

    form {
        text-align: left;
    }

    table {
        width: 80%;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"],
    input[type="date"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
    }
</style>

<title>Insert title here</title>
</head>
<body>
<body>
    <div align="center">
    <h1>Online Quiz Portal</h1>
        <h2>Registration Page</h2>
        <form action="registerServlet" method="POST">
            <table>
                <tr>
                    <td><input type="text" name="name" placeholder="Name"></td>
                </tr>
                <tr>
                    <td><input type="email" name="email" placeholder="Email"></td>
                </tr>
                <tr>
                    <td><input type="password" name="password" placeholder="Password"></td>
                </tr>
                <tr>
                    <td><input type="date" name="dob" placeholder="Date of Birth"></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Register"> <br><br> <h3><a href="index.jsp">Main</a></h3>
        </form>
    </div>

</body>
</html>