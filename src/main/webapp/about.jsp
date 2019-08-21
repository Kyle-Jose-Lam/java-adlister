<%--
  Created by IntelliJ IDEA.
  User: fercodeup
  Date: 2019-08-21
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<ul>
    <c:if test="${param.color == 'blue'}">
        <li>this shows only for blue</li>
    </c:if>
    <c:if test="${param.color != 'blue'}">
        <li>this shows only for non-blue</li>
    </c:if>
    <li>This always shows</li>
</ul>

<c:choose>
    <c:when test="${param.role == 'admin'}">
        <button>Delete users</button>
        <button>Edit profile</button>
    </c:when>
    <c:when test="${param.role == 'user'}">
        <button>Create a post</button>
        <button>Edit profile</button>
    </c:when>
    <c:otherwise>
        <%-- Guests --%>
        <button>Create an account</button>
    </c:otherwise>
</c:choose>

<%! String[] names = {"fer", "daniel", "nestor", "nikho"}; %>
<% request.setAttribute("names", names); %>

<nav>
    <ul>
        <c:forEach var="name" items="${names}">
            <li>${name}</li>
        </c:forEach>
    </ul>
</nav>

<%@ include file="/partials/scripts.jsp" %>

</body>
</html>
