<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.board.model.Post" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
</head>
<body>
    <h1>로그인</h1>
    <form action="login" method="post">
        아이디: <input type="text" name="username"><br>
        비밀번호: <input type="password" name="password"><br>
        <input type="submit" value="로그인">
    </form>
</body>
</html>
