package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.Member;

import java.io.IOException;
import java.sql.SQLException;

import dao.MemberDAO;



@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. 있으면 폼 값 받아온다.
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		boolean check = true;
		
		
		// 2. DAO 호출 - DB 접근 필요시
				MemberDAO dao = new MemberDAO();
				try {
					dao.register(new Member(id, name, pwd, age));
				} catch (SQLException e) {
					check = false;
				}
				
				//3. 바인딩 : 결과 페이지에 서버에서 받은 값 보내야 할 때
				
				//request.setAttribute("name", name);
				request.setAttribute("check", check);
		
				
				
				
				
				//4. 네이게이션 : 결과페이지 지정
				// check가 true인 경우 회원가입 성공 페이지로
				// check가 false인 경우 실패 페이지로 이동
				
				/*
				if(check == true) {
					//response.sendRedirect("result.jsp");
					// 만약 결과페이지로 서버에서 받은 값 보여주려면 -> requestDispatcher forward 방식으로 보내야 함
					
				}else {
					response.sendRedirect("fail.jsp");
				}
				*/
				
				// 결과페이지는 하나로
				request.getRequestDispatcher("result.jsp").forward(request, response);
				
		
				
	}

	
}
