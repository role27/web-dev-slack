<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Ajax</title>
</head>
<body>
<<<<<<< HEAD
	<!-- Ajax(Asynchronous JavaScript and XML) : 비동기적 정보 교환 기법 -->
=======
	
	<!-- Ajax(Asynchronous JavaScript and XML) : 비동기적 정보 교환 기법-->
>>>>>>> cc51683f9aef4c6357ca3ec27c929babad933096
	<h1>Count</h1>
	<input type="button" id="btn" value="증가" onclick="startRequest()">
	<p id="result"></p>
	
<<<<<<< HEAD
	<!-- 자바스크립트 방식 -->
	<script>
		let xhr;
		function startRequest() { // 요청에 해당하는 로직을 담는 메서드
			xhr = new XMLHttpRequest();
			xhr.onreadystatechange = callback;
			xhr.open("get", "/count");
			xhr.send(null); // 이때 서버로 전송.. 실질적인 요청이 들어감!
		}
		
		function callback() { // 응답에 해당하는 로직을 담는 메서드
			if(xhr.readyState === 4) {
				if(xhr.status === 200) {
					//alert(xhr.responseText);
					const count = xhr.responseText;
					document.querySelector("#result").innerHTML = count;
				}
=======
	<!-- 자바스트립트 방식-->
	
	<script>
		let xhr;
		function startRequest(){ // 
			xhr = new XMLHttpRequest();
			xhr.onreadystatechange = callback;
			xhr.open("get", "/count");
			xhr.send(null); // 이때 서버로 전송 , 실질적인 요청이 들어감
		}
		function callback(){//응답에 해당하는 로직을 담는 메서드
			if(xhr.readyState === 4){
			  if(xhr.status === 200){
				//(xhr.responseText);
				const count = xhr.responseText;
				document.querySelector("#result").innerHTML=count;
			  }
>>>>>>> cc51683f9aef4c6357ca3ec27c929babad933096
			}
		}
	</script>
	
	
	
	
<<<<<<< HEAD
	
	
	
=======
>>>>>>> cc51683f9aef4c6357ca3ec27c929babad933096
</body>
</html>