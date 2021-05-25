<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<form method="post" action="/ServletPrj/member">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="password"><br>
		이름 : <input type="text" name="name"><br>
		나이 :  <input type="text" name="age"><br>
		<input type="submit" value="입력 완료">
	</form>
</body>
</html>