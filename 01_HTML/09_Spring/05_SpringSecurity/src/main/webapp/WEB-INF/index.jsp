<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>
	<sec:authorize access="isAnonymous()"> <!-- 누구나 볼 수 있음-->
			<a href="/register">회원가입</a>
			<a href="/login">로그인</a>
			</sec:authorize>
	<sec:authorize access="isAuthenticated()"> <!-- 인증된 사람만 -->			
			
			<a href="/logout">로그아웃</a>
			<a href="/mypage">마이 페이지</a>
			</sec:authorize>							
           
			<sec:authorize access="hseRole('ADMIN')">
			<a href="/admin">관리자 페이지</a><br>
			</sec:authorize>
	</body>
	</html>