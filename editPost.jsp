<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.board.model.Post" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>게시물 수정</title>
</head>
<body>
    <h1>게시물 수정</h1>
    <form action="updatePost" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${post.id}">
        제목: <input type="text" name="title" value="${post.title}"><br>
        내용: <textarea name="content">${post.content}</textarea><br>
        <p>첨부 파일: <a href="downloadFile?id=${post.id}">${post.fileName}</a></p>
        <p>새로운 파일 선택: <input type="file" name="newFile"></p>
        <input type="submit" value="수정">
    </form>
    <a href="board">목록으로</a>
</body>
</html>