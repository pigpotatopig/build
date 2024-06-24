<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.board.model.Post" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>글 쓰기</title>
</head>
<body>
    <h1>글 쓰기</h1>
    <form action="uploadFile" method="post" enctype="multipart/form-data">
        파일 선택: <input type="file" name="file"><br>
        제목: <input type="text" name="title"><br>
        내용: <textarea name="content"></textarea><br>
        <input type="submit" value="업로드">
    </form>
    <a href="board">목록으로</a>
</body>
</html>