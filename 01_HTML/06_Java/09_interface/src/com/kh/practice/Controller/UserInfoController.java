package com.kh.practice.Controller;

import java.time.LocalDate;
import com.kh.practice.model.UserInfo;
import com.kh.practice.model.Department;

public class UserInfoController {

	private UserInfo user = new UserInfo();

	public void insertEmp(int userNo, String id, String password, String email, String name, String phone, String addr,
			String gender, LocalDate birthDate, Department department) {
		user.setUserNo(userNo);
		user.setId(id);
		user.setPassword(password);
		user.setEmail(email);
		user.setName(name);
		user.setPhone(phone);
		user.setAddr(addr);
		user.setGender(gender);
		user.setBirthDate(birthDate);
		user.setDapartment(department);
	}
	
	//직원정보 반환
	public UserInfo getEmp() {
		return user;
	}

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

	// 전화번호 수정
	public void updatephone(String phone) {
		if (user.getPhone() != null) {
			user.setPhone(phone);
		}
	}

	// 생년월일 수정
	public void updatebirthdate(LocalDate birthDate) {
		if (user.getBirthDate() != null) {
			user.setBirthDate(birthDate);
		}
	}

	// 부서 수정
	public void updatedepartment(Department department) {
		if (user.getDapartment() != null) {
			user.setDapartment(department);
		}
	}

}
