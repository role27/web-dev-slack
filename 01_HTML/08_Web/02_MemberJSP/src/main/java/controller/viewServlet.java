package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.Member;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.MemberDAO;


@WebServlet("/view")
public class viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		try {
			// DB정보필요
			MemberDAO dao = new MemberDAO();
			
			ArrayList<Member> list = dao.memberAll();
			
			// 바인딩 -> 이정도가 필요한지
			request.setAttribute("list", list);
			
		
			// 네비게이션 -> view.jsp
			request.getRequestDispatcher("view.jsp").forward(request, response);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
			
	}


