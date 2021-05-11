<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/ServletPrj/login">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="password"><br>
		이름 : <input type="text" name="name"><br>
		취미 :  <input type="checkbox" name="hobby" value="climbing"> climbing
		 <input type="checkbox" name="hobby" value="swim"> swim
		 <input type="checkbox" name="hobby" value="reading"> reading
		 <input type="checkbox" name="hobby" value="music"> music<br>
		 <input type="radio" name="gender" value="male"> 남성
		 <input type="radio" name="gender" value="female"> 여성<br>
		 <select name="job" size="1">
		 	<option value="">선택</option>
		 	<option value="student">학생</option>
		 	<option value="company">공무원</option>
		 	<option value="no job"> 무직 </option>
		 </select><br>
		 <textarea row="10" cols="10" name="contents"></textarea> <br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>