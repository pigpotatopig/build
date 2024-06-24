<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.board.model.Post" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>게시물 보기</title>
</head>
<body>
    <h1>게시물 보기</h1>
    <h2>${post.title}</h2>
    <p>${post.content}</p>
    <p>첨부 파일: <a href="downloadFile?id=${post.id}">${post.fileName}</a></p>
    <h3>댓글</h3>
    <form action="addComment" method="post">
        <input type="hidden" name="postId" value="${post.id}">
        내용: <textarea name="content"></textarea><br>
        <input type="submit" value="댓글 작성">
    </form>
    <ul>
        <c:forEach var="comment" items="${comments}">
            <li>${comment.content} <a href="deleteComment?id=${comment.id}&postId=${post.id}">삭제</a></li>
        </c:forEach>
    </ul>
    <a href="board">목록으로</a>
</body>
</html>