<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/12
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach var="person" items="${persons}">
    ${person.id}-----${person.name}-----${person.age}<br/>
</c:forEach>
</body>
</html>
