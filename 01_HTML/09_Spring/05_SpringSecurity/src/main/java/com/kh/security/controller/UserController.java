package com.kh.security.controller;

import java.net.Authenticator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.security.config.TokenProvider;
import com.kh.security.service.UserService;
import com.kh.security.vo.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TokenProvider tokenProvider;
	
	@GetMapping("/index")
	public void index() {}
	
	// localhost:8080/register <-- 회원가입 페이지로 이동
	@GetMapping("/register")
	public String register() {
		return "/register";
	}
	
	
	@PostMapping("/register")
	public String register(User vo) {
		userService.register(vo);
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}	
	
	@GetMapping("/mypage")
	public void mypage() {}
		
	
	@GetMapping("/admin")
	public void admin() {
		
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	User user = (User) auth.getPrincipal();
	System.out.println(user);
	
	}
	

	@ResponseBody
	@PostMapping("/login")
	public String login(User vo) {
		User user = userService.login(vo);
		if(user!=null) {
			// 로그인 성공 -> 서버는 토큰 생성만, 가지고 있는 클라이언트
			String token = tokenProvider.create(user);
			return token;
		}
		return null;
	}
	
	@GetMapping("/check")
	public void check(String token) {
		System.out.println(token);
	}
}
