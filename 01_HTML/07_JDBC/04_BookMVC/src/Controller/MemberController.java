package Controller;

import java.sql.SQLException;

import dao.MemberDAO;
import vo.Member;

public class MemberController {
	
	private MemberDAO dao = MemberDAO.getInstance();
	

	//4. 회원가입
	public void register(Member member) {
		// id가 primary key 에러가 납니다. 활용하기 -> 중복체크
		
		try {
			dao.register(member);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//5. 로그인
	public Member login(String id, String pwd) throws SQLException {
		
		Member member = dao.login("user01", "pass123");

		if (member != null) {
		    System.out.println("로그인 성공: " + member.getId());
		} else {
		    System.out.println("로그인 실패: 아이디 또는 비밀번호가 틀립니다.");
		}
		return member;
	}
	
	
	
	//6. 회원탈퇴
	public void delete(String id) {
		// 회원탈퇴시 대여중인 책을 모두 기록 삭제
	}
}
