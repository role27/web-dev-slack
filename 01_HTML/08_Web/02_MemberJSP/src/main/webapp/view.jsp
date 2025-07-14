
<%@page import="vo.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h2>회원 조회</h2>
  <form action="search">
  검색할 회원 아이디 : <input type="text" name="id">
  <input type="submit" value="조회">
  </form>

   <h1>전체리스트</h1>
   <% ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list"); %>
	<table>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>나이</th>

		</tr>

		<%
		for (Member member : list) {
		%>
		<tr>
		<tr><%=member.getId()%></tr>
		<tr><%=member.getPwd()%></tr>
		<tr><%=member.getName()%></tr>
		<tr><%=member.getAge()%></tr>
		</tr>

			<% } %>
		
	</table>
</body>
</html>