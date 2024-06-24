<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시물 상세보기</title>
</head>
<body>
    <h1>${post.title}</h1>
    <p>${post.content}</p>
    <p>작성자: ${post.author}</p>
    <p>작성일: ${post.createdDate}</p>
    
    <h2>댓글 목록</h2>
    <ul>
        <c:forEach var="comment" items="${post.comments}">
            <li>${comment.content} - 작성자: ${comment.author}</li>
        </c:forEach>
    </ul>
    
    <form action="<c:url value='/comments/new' />" method="post">
        <input type="hidden" name="postId" value="${post.id}">
        <textarea name="content" placeholder="댓글을 입력하세요"></textarea><br>
        <input type="submit" value="댓글 작성">
    </form>
    
    <a href="<c:url value='/board' />">목록으로</a>
</body>
</html>