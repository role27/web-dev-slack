package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;
import vo.Book;


public class BookDAO {
	
	public BookDAO() {
		
		try {
			Class.forName(ServerInfo.DRIVER);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection Connect() throws SQLException {
		return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
	}

	
	
	
	// 1. 전체 책 조회
	
	public ArrayList<Book> printBookAll() throws SQLException{
		Connection connect = Connect();

		String query = "SELECT * FROM Book";
		PreparedStatement ps = connect.prepareStatement(query);

		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
				int bookNo = rs.getInt("bookNo");
				String title = rs.getString("title");
				String author = rs.getString("author");
				int accessAge = rs.getInt("accessAge");
				
				System.out.println("bookNo: " + bookNo + ", title: " + title + ", author: " + author + ", accessAge: " + accessAge);
			
		}
		return null;
	}
	

	// 2. 책 등록
	
	public void registerBook(String title, String author, int accessAge) throws SQLException {
		Connection connect = Connect();
		
		String query = "INSERT INTO Book (title, author, accessAge) VALUES (?,?,?)";
		PreparedStatement ps = connect.prepareStatement(query);
		ps.setString(1, "소년이온다");
		ps.setString(2, "한강");
		ps.setInt(3, 15);
		

		ps.executeUpdate();
		
		return;
	}
		
	
	
	//3. 책 삭제
	
	public void sellBook(int bookNo) throws SQLException {
		Connection connect = Connect();

		String query = "DELETE FROM Book WHERE bookNo = ?";
		PreparedStatement ps = connect.prepareStatement(query);

		ps.setInt(1, bookNo);
		
		ps.executeUpdate();

	}
	
	
}
