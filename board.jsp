<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.board.model.Post" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>게시판</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
    </style>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>게시판</h1>
    <a href="writePost">글 쓰기</a>
    <h2>게시물 목록</h2>
    <table>
        <tr>
            <th>제목</th>
            <th>내용</th>
            <th>첨부 파일</th>
            <th>수정</th>
            <th>삭제</th>
        </tr>
        <c:forEach var="post" items="${posts}">
            <tr>
                <td><a href="viewPost?id=${post.id}">${post.title}</a></td>
                <td>${post.content}</td>
                <td><a href="downloadFile?id=${post.id}">${post.fileName}</a></td>
                <td><a href="editPost?id=${post.id}">수정</a></td>
                <td><a href="deletePost?id=${post.id}">삭제</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>