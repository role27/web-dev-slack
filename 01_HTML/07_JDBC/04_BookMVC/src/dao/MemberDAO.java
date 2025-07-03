package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;
import vo.Member;

public class MemberDAO {
	
	private static MemberDAO instance = new MemberDAO();
	
	
	public MemberDAO() {
		try {
			Class.forName(ServerInfo.DRIVER);		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static MemberDAO getInstance() {
		return instance;
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
	
	

	//4. 회원가입
	public void register(Member member) throws SQLException {
		Connection connect = Connect();
		String query = "INSERT INTO member VALUES(?, ?, ?, ?)";
		PreparedStatement ps = connect.prepareStatement(query);
		ps.setString(1, member.getId());
		ps.setString(2, member.getName());
		ps.setString(3, member.getPwd());
		ps.setInt(4, member.getAge());
		
		ps.executeUpdate();
		
		
		return;


	}

	
	//5. 로그인
	public Member login(String id, String pwd) throws SQLException {
		
		Connection connect = Connect();
		
		
		String query = "SELECT * FROM Member WHERE id = ? AND pwd = ?";
	    PreparedStatement ps = connect.prepareStatement(query);
	    ps.setString(1, id);
	    ps.setString(2, pwd);
	    
	    ResultSet rs = ps.executeQuery();
		
	    if (rs.next()) {
	        // 컬럼 순서는 실제 DB에 따라 조정
	       Member member = new Member(
	            rs.getString("id"),
	            rs.getString("name"),
	            rs.getString("pwd"),
	            rs.getInt("age"));
	
	    }
	    
	    rs.close();
	    ps.close();
	    connect.close();

	    return null;
		
	}
	
	//6. 회원탈퇴
	public void delete(String id) {
		
	}
}
