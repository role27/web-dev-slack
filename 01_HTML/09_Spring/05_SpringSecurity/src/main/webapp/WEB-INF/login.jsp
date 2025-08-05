<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

</head>
<body>
	<h2>로그인</h2>
	<form action="login" method="post">
	아이디 : <input type="text" name="username"><br>
	비밀번호 : <input type="password" name="password"><br>
	<input type = "submit" value="로그인"><br>
	</form>
	
	
	<script>
			$("#login").click((e) => {
				e.preventDefault(); // 기존 이벤트 제거
				$.ajax({
					url:'/login',
					type: 'post',
					data : $('#frm').serialize(),
					success: function(data) {
						// localStorage에 token 키 값으로 저장
						localStorage.setItem("token", data);
						// / <- index.jsp로 이동
						location.href = "/";
					}
				});
			});
		</script>
	
	</body>
	</html>