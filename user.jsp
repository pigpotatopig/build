<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>사용자 정보</title>
</head>
<body>
    <h1>${user.username}의 프로필</h1>
    <p>Email: ${user.email}</p>
    <p>생성일: ${user.createdDate}</p>
    
    <h2>팔로워 목록</h2>
    <ul>
        <c:forEach var="follower" items="${user.followers}">
            <li>${follower.username}</li>
        </c:forEach>
    </ul>
</body>
</html>