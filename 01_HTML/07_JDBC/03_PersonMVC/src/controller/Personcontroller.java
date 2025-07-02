package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import config.ServerInfo;

public class Personcontroller {

	// 리턴 타입이나 파라미터 자유롭게 변경 가능
	// 메서드 추가 가능

	public Personcontroller() {
		try {
			Class.forName(ServerInfo.DRIVER);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 고정적으로 반복 -- 디비연결, 자원반납
	// 2. 디비연결
	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
	}

	// 오버로딩
	public void close(PreparedStatement ps, Connection connect) throws SQLException {
		ps.close();
		connect.close();
	}

	public void close(ResultSet rs, PreparedStatement ps, Connection connect) throws SQLException {
		rs.close();
		close(ps, connect);
	}
	
	// ------- 변동적인 반복 : DAO(Database Access Object)
	
	
	// person 테이블에 데이터 추가 - INSERT
	public void addPerson() throws SQLException {
		Connection connect = getConnect();

		String query = "INSERT INTO person (name, age, addr) VALUES (?,?,?)";
		PreparedStatement ps = connect.prepareStatement(query);

		ps.setString(1, "봉구");
		ps.setInt(2, 7);
		ps.setString(3, "경기도 광주");

		// 로직 추가 예정

		// 4. 쿼리실행

		 System.out.println(ps.executeUpdate() + "명 추가");

		// 5. 자원반납

		close(ps, connect);
	}


	// person 테이블에 있는 데이터 전체 보여주기 - SELECT
	public void searchAllPerson() throws SQLException {

		Connection connect = getConnect();

		String query = "SELECT * FROM person";
		PreparedStatement ps = connect.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String addr = rs.getString("addr");
			
			System.out.println("ID: " + id + ", 이름: " + name + ", 나이: " + age + ", 주소: " + addr);
		}
		
		close(rs, ps, connect);
	}
		
	
		

	

	// person 테이블에서 데이터 한개만 가져오기 - SELECT -> ID로
	public void searchPerson() throws SQLException {

		Connection connect = getConnect();

		String query = "SELECT * FROM person WHERE id = ? ";
		PreparedStatement ps = connect.prepareStatement(query);

		ps.setInt(1, 101);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			System.out.println("ID: " + rs.getInt("id"));
		} else {
			System.out.println("해당 ID의 데이터를 찾을 수 없습니다.");
		}

		close(rs, ps, connect);

	}

	// person 테이블에 데이터 수정 - UPDATE
	public void updatePerson() throws SQLException {
		Connection connect = getConnect();

		String query = "UPDATE person SET age = ? WHRER name = ?";
		PreparedStatement ps = connect.prepareStatement(query);

		ps.setInt(1, 7);
		ps.setString(2, "레오");

		System.out.println(ps.executeUpdate() + "건 수정");

		close(ps, connect);
	}

	// person 테이블에 데이터 삭제 - DELETE
	public void removePerson() throws SQLException {
		Connection connect = getConnect();

		String query = "DELETE FROM person WHERE id = ?";
		PreparedStatement ps = connect.prepareStatement(query);

		ps.setInt(1, 100);
		// 로직 추가 예정

		  System.out.println(ps.executeUpdate() + "건 삭제");

		close(ps, connect);

	}

}
