<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1;%>
<html>
<%@ include file="/partials/header.jsp"%>
<body>

<%-- Comments --%>

<h1>Fer</h1>

<h1>The current count is <%= counter %>.</h1>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->
<%@ include file="/partials/scripts.jsp" %>
</body>
</html>