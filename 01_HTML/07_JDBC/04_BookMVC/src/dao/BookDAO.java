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

	public void close(PreparedStatement ps, Connection connect) throws SQLException {
		ps.close();
		connect.close();
	}

	public void close(ResultSet rs, PreparedStatement ps, Connection connect) throws SQLException {
		rs.close();
		close(ps, connect);
	}
	
	
	
	
	// 1. 전체 책 조회
	
	public ArrayList<Book> printBookAll() throws SQLException{
		Connection connect = Connect();

		String query = "SELECT * FROM Book";
		PreparedStatement ps = connect.prepareStatement(query);

		ResultSet rs = ps.executeQuery();
		
		 ArrayList<Book> bookList = new ArrayList<>();
		
		 while (rs.next()) {
		      //  Book book = new Book( rs.getInt("bookNo"), rs.getString("title"), rs.getString("author"), rs.getInt("accessAge"));
				
		      //  bookList.add(book);
				
		}
		
		rs.close();
	    ps.close();
	    connect.close();

	    return bookList;
	}
	

	// 2. 책 등록
	
	public void registerBook(String title, String author, int accessAge) throws SQLException {
		Connection connect = Connect();
		
		String query = "INSERT INTO Book (title, author, accessAge) VALUES (?,?,?)";
		PreparedStatement ps = connect.prepareStatement(query);
		ps.setString(1, title);
		ps.setString(2, author);
		ps.setInt(3, accessAge);
		

		ps.executeUpdate();
	    System.out.println("책 등록 완료: " + title + ", " + author + ", " + accessAge);
		
		ps.close();
	    connect.close();
	    
	
	}
		
	
	
	//3. 책 삭제
	
	public void sellBook(int bookNo) throws SQLException {
		Connection connect = Connect();

		String query = "DELETE FROM Book WHERE bookNo = ?";
		PreparedStatement ps = connect.prepareStatement(query);

		ps.setInt(1, bookNo);
		
		 int result = ps.executeUpdate(); // 삭제된 행 수 반환

		    if (result > 0) {
		        System.out.println("도서 번호 " + bookNo + "번 책이 삭제되었습니다.");
		    } else {
		        System.out.println("해당 도서 번호를 찾을 수 없습니다.");
		    }

		    ps.close();
		    connect.close();

	}
	
	
}
