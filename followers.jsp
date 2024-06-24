<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.board.model.Post" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>팔로워</title>
</head>
<body>
    <h1>팔로워</h1>
    <form action="addFollower" method="post">
        팔로워 아이디: <input type="text" name="followerUsername"><br>
        <input type="submit" value="팔로워 추가">
    </form>
    <h2>팔로워 목록</h2>
    <ul>
        <c:forEach var="follower" items="${followers}">
            <li>${follower.username} <a href="deleteFollower?followerId=${follower.id}">삭제</a></li>
        </c:forEach>
    </ul>
    <a href="board">목록으로</a>
</body>
</html>