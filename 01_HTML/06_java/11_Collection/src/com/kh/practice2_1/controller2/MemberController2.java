package com.kh.practice2_1.controller2;

import java.util.ArrayList;

import com.kh.practice2.model.Member;

public class MemberController2 {

	 // 전체 회원 목록
		ArrayList<Member> members = new ArrayList<>();
		{
		members.add(new Member("김로이", 18, 10, new ArrayList<>()));
		members.add(new Member("김레오", 20, 10, new ArrayList<>()));
		
		}
		
		
		
		// 현재 로그인된 회원
		private Member loginMember = getMember();
		
		
		// 회원가입 및 로그인처리
		public boolean registerAndLogin(String name, int age){
			// 동일 이름이 존재하면 가입 불가 처리
			for(Member m : members) {
				if(m.getName().equals(name)) {
					if(m.getAge() == age) {
						loginMember = m;
						return true;
					}else {
						return false;
					}
					
				}
			}
			
			// 이름이랑 나이가 같은 경우 로그인 처리
		
			
			
			// 기존에 해당하는 이름이 없다면 가입 후 로그인 처리
			return false;
		}
		
		// 로그아웃
		public void logout() {
			
			
		}
		
		// 마이페이지 - 현재 로그인된 정보
		public Member getMember() {
			
			return null;
		}
}
