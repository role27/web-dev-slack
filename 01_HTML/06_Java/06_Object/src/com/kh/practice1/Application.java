package com.kh.practice1;

import com.kh.practice1.model.UserInfo;

public class Application {

	public static void main(String[] args) {

		UserInfo userinfo = new UserInfo();
		
		userinfo.changeName("뭉뭉이");
		
		System.out.println(userinfo.printName());
	
	}
	
	
}
