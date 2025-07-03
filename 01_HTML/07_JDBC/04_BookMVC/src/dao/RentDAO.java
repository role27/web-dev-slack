package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import config.ServerInfo;
import vo.Rent;

public class RentDAO {
	
	
	public RentDAO() {
		try {
			Class.forName(ServerInfo.DRIVER);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection Connect() throws SQLException {
		return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		}

	
	
	
	// 7. 책 대여
	public void rentBook(String id, int bookNo) throws SQLException {
		
		Connection connect = Connect();
		String query = "INSERT INTO Rent (memberId, bookNo) VALUES (?, ?)";
		PreparedStatement ps = connect.prepareStatement(query);

		ps.setString(1, id);
		ps.setInt(2, bookNo);

		int result = ps.executeUpdate();

		if (result > 0) {
			System.out.println("도서 대여 성공");
		} else {
			System.out.println("도서 대여 실패");
		}

	}

	// 8. 내가 대여한 책 조회
	public ArrayList<Rent> printRentBook(String id) throws SQLException{
		  
		ArrayList<Rent> rentList = new ArrayList<>();
		
		
		Connection connect = Connect();
		String query = "SELECT * FROM Rent WHERE memberId = ?";
		PreparedStatement ps = connect.prepareStatement(query);
		
		  ps.setString(1, id);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            int rentNo = rs.getInt("rentNo");
	            String memberId = rs.getString("memberId");
	            int bookNo = rs.getInt("bookNo");
	            LocalDate rentDate = rs.getDate("rentDate").toLocalDate();
	            		
	            		//rs.getTimestamp("rentDate");

	            
	            //Rent rent = new Rent(rentNo, memberId, bookNo, rentDate);
	            //rentList.add(rent);
	        }

	        rs.close();

		
		
		
	        return rentList;
	}
	
	//9. 대여취소
	public void deleteRent(int rentNo) throws SQLException {
		
		Connection connect = Connect();
		String query = "DELETE FROM Rent WHERE rentNo = ?";
		PreparedStatement ps = connect.prepareStatement(query);
		
		 ps.setInt(1, rentNo);

	        int result = ps.executeUpdate();

	        if (result > 0) {
	            System.out.println("대여 취소 완료");
	        } else {
	            System.out.println("대여 취소 실패: 해당 번호 없음");
	        }
		
	}
}
