<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.board.model.CommentModel" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>댓글</title>
</head>
<body>
    <h1>댓글</h1>
    <a href="<c:url value='/comments/new' />">댓글 쓰기</a>
    <h2>댓글 목록</h2>
    <table>
        <tr>
            <th>댓글 ID</th>
            <th>내용</th>
            <th>수정</th>
            <th>삭제</th>
        </tr>
        <c:forEach var="comment" items="${comments}">
            <tr>
                <td>${comment.commentId}</td>
                <td>${comment.content}</td>
                <td><a href="<c:url value='/comments/' + comment.commentId + '/edit' />">수정</a></td>
                <td><a href="<c:url value='/comments/' + comment.commentId + '/delete' />">삭제</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>