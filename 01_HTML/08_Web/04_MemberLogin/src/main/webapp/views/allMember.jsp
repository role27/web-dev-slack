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
   <% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list"); %>
   <table border="1">
   
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
		<td><%=member.getId()%></td>
		<td><%=member.getPwd()%></td>
		<td><%=member.getName()%></td>
		<td><%=member.getAge()%></td>
		</tr>

			<% } %>
			
		</table>
	
</body>
</html>