<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>팔로워 목록</title>
</head>
<body>
    <h1>팔로워 목록</h1>
    <ul>
        <c:forEach var="follower" items="${followers}">
            <li>${follower.username} - <a href="<c:url value='/followers/${follower.id}/delete' />">언팔로우</a></li>
        </c:forEach>
    </ul>
</body>
</html>