package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;
import vo.Member;


public class MemberDAO {
 public MemberDAO() {
		
		try {
			Class.forName(ServerInfo.DRIVER);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection Connect() throws SQLException {
		return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
	}
	


	
	// 회원가입
	public void register() {
		Connection connect = Connect();
		
		String query = "INSERT INTO member VALUES(?,?,?,?)";
		PreparedStatement ps = connect.prepareStatement(query);	
		ps.setString(1, Member.getId());
		ps.setString(2, Member.getName());
		ps.setString(3, Member.getPws());
		ps.setInt(4, Member.getAge());
		
		ps.executeUpdate(query);
	}

	
	
}
