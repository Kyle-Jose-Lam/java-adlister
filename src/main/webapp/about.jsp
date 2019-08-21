<%--
  Created by IntelliJ IDEA.
  User: fercodeup
  Date: 2019-08-21
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%-- Be consistent choose one, this is Fer's fav --%>
<jsp:include page="/partials/header.jsp" />
<body>

<h1>about us</h1>

<% request.setAttribute("message", "error message"); %>

<h1>Here is the message: ${message}</h1>

<p id="reset">"page_no" parameter: ${param.page_no != null ? param.page_no : 'No results'}</p>

<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"color" parameter:
    <%
    if( request.getParameter("color") != null ){
        response.getWriter().write(request.getParameter("color"));
    }else{
        response.getWriter().write("No results");
    }
    %>
</p>

<p>User-Agent header: <%= request.getHeader("user-agent")  %></p>


<%@ include file="/partials/scripts.jsp" %>

</body>
</html>
