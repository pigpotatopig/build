<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>사용자 등록</title>
</head>
<body>
    <h1>사용자 등록</h1>
    <form action="<c:url value='/users/new' />" method="post">
        사용자명: <input type="text" name="username"><br>
        이메일: <input type="email" name="email"><br>
        비밀번호: <input type="password" name="password"><br>
        <input type="submit" value="회원가입">
    </form>
    <a href="<c:url value='/board' />">돌아가기</a>
</body>
</html>