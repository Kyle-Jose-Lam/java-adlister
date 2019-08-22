<%--
  Created by IntelliJ IDEA.
  User: fercodeup
  Date: 2019-08-22
  Time: 09:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")){

        //  Getting the info from the HTTP request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equalsIgnoreCase("admin") && password.equals("Pa$$w0rd!")){
            response.sendRedirect("/profile.jsp");
        }
    }

%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/login.jsp" method="post">
    <label for="username">Username</label>
    <input type="text" id="username" name="username">
    <label for="password">Password</label>
    <input type="password" id="password" name="password">
    <button>Login</button>
</form>

</body>
</html>
