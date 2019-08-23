<%--
  Created by IntelliJ IDEA.
  User: fercodeup
  Date: 2019-08-23
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Apply now for our <span>${sessionScope.program}</span> program</h1>

<h3>Price: $${price}.00</h3>

<form action="#">

    <c:if test="${sessionScope.program == 'DS'}">
        <label for="q1">Do you know python?</label>
        <select name="q1" id="q1">
            <option value="0">No</option>
            <option value="1">Yes</option>
        </select>
    </c:if>

    <label for="q2">Do you like solving problems?</label>
    <select name="q2" id="q2">
        <option value="0">No</option>
        <option value="1">Yes</option>
    </select>

</form>

</body>
</html>
