<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pagelet 1</title>
</head>
<body>

    <h1>Welcome to Pagelet 1</h1>
    
    <p>This is the content of Pagelet 1 (A simple login form)</p>

    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <input type="submit" value="Login">
    </form>

    <p><a href="${pageContext.request.contextPath}/pagelet2.jsp">Go to Pagelet 2</a></p>

</body>
</html>
