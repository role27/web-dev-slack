package com.kh.practice.Controller;

import java.time.LocalDate;
import com.kh.practice.model.UserInfo;
import com.kh.practice.model.Department;
import com.kh.practice.model.DeptType;

public class UserInfoController {

	private UserInfo[] userList = {new UserInfo(), new UserInfo(), new UserInfo()};
	
	private int count = 0;

	// 로그인 -> 유저 정보 클라이언트
	
	public UserInfo login(String id, String password) {
		for(UserInfo user : userList) {
			if(id.equals(user.getId()) && password.equals(user.getPassword())) {
				return user;
			}
	
		}
		return null;
	}

	
	/*
	// 오버로딩
	public void addUser(int userNo, String id, String password, String email, String name) {
		
		user.setUserNo(userNo);
		user.setId(id);
		user.setPassword(password);
		user.setEmail(email);
		user.setName(name);
	}
	
	
	public void addUser(String phone, String addr, String gender, LocalDate birthDate, Department department) {
		
		user.setPhone(phone);
		user.setAddr(addr);
		user.setGender(gender);
		user.setBirthDate(birthDate);
		user.setDepartment(department);
	}
	*/
	
	// 여러명 일 때
	// 오버로딩
		public void addUser(int userNo, String id, String password, String email, String name) {
			
			userList[count].setUserNo(userNo);
			userList[count].setId(id);
			userList[count].setPassword(password);
			userList[count].setEmail(email);
			userList[count].setName(name);
			count++;
		}
		
		
		public void addUser(String phone, String addr, String gender, LocalDate birthDate, int deptNo) {
			
			userList[count].setPhone(phone);
			userList[count].setAddr(addr);
			userList[count].setGender(gender);
			userList[count].setBirthDate(birthDate);
			userList[count].setDeptNo(deptNo);
			}
		
		// 지금 테이블이 없는 상태에서 지금부터 추가된 코드 ..여기서만 봄..
		//Department dept = new Department(deptNo, DeptType.findDeptName(deptNo));
		//userList[count].setDepartment(dept);
		
		
			
		
	
	/*
	//직원정보 반환
	public UserInfo getUser() {
		return user;
	}
*/
	/*
	// 아이디, 비밀번호 체크
	public String idCheck(String id) {
		if (user.getId().equals(id)) {
			return "Y";
		}
		return "N";
	}

	public String pwdCheck(String password) {
		if (user.getPassword().equals(password)) {
			return "Y";
		}
		return "N";
	}
*/
	
	//메서드1개
	public void updateUser(UserInfo user) {
		for(UserInfo info : userList) {
			if(user.getUserNo() == info.getUserNo()) {
				info = user;
			}
		}
		
	}
	
/*
	//메서드3개
	// 전화번호 수정
	public void updatephone(String phone) {
		if (user.getPhone() != null) {
			user.setPhone(phone);
		}
	}
	/*
	public void updateUser(String phone) {
		user.setPhone(phone);
		
	}
*/
	/*
	// 생년월일 수정
	public void updatebirthdate(LocalDate birthDate) {
		if (user.getBirthDate() != null) {
			user.setBirthDate(birthDate);
		}
	}
	
	/*
	public void updateUser(LocalDate birthDate) {
		user.setBirthDate(birthDate);
		
	}
*/
	/*
	// 부서 수정
	public void updatedepartment(Department department) {
		if (user.getDepartment() != null) {
			user.setDepartment(department);
		}
	}

	/*
	public void updateUser(Department department) {
		user.setDepartment(department);
	
	}
	*/
	

	
}

