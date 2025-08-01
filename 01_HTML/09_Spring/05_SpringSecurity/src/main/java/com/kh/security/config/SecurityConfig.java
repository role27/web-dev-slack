package com.kh.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;

@Configuration
public class SecurityConfig {

	@Bean 
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		return http
				.csrf(csrf -> csrf.disable()) // 웹 보안 토큰 설정 (비활성화)
	            .authorizeHttpRequests(authorize -> authorize
	            		.requestMatchers("/mypage").authenticated() //-> 로그인된 사용자만 가능
	            		.requestMatchers("/admin").hasRole("ADMIN")
	            		.anyRequest().permitAll()) // 어떤 요청이든 모두 수락하겠다
	            .formLogin(form-> 
	                     form.loginPage("/login")
	            		     .defaultSuccessUrl("/mypage")       
	            		)
	            .logout(logout->logout.logoutUrl("logout")
	            		.logoutSuccessUrl("/")
	            		)
				.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
		StrictHttpFirewall firewall = new StrictHttpFirewall();
		// 중복 슬래시 허용
		firewall.setAllowUrlEncodedDoubleSlash(true); // URL 인코딩된 // 허용 (%2F%2F)
		firewall.setAllowSemicolon(true); // 세미콜론도 허용할 수 있음 (선택)
		return firewall;
	}
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return web -> web.httpFirewall(allowUrlEncodedSlashHttpFirewall());
	}
	
	
	
}
