package com.kh.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.ServerInfo;

public class TransactionTest2 {

	
/*
 * 지은 -> 지연 : 3만원 이체
 * 지은님의 잔액이 마이너스 될 경우 이체 취소
 * UPDATE 2개, SELECT 1개
 * 
 * */
	public static void main(String[] args) {
		
		try {
			Class.forName(ServerInfo.DRIVER);
			Connection connect = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
			

			int balance = 30000;
			String send = "지은";
			String to = "지연";
			
			connect.setAutoCommit(false);
			
			
			PreparedStatement ps3 = connect.prepareStatement("UPDATE bank SET balance = balance - ? WHERE name = ?");
			
			ps3.setInt(1, balance);
			ps3.setString(2, send);
			ps3.executeUpdate();
			
			
			PreparedStatement ps4 = connect.prepareStatement("UPDATE bank SET balance = balance + ? WHERE name = ? ");
			
			ps4.setInt(1, balance);
			ps4.setString(2, to);
			ps4.executeUpdate();
			
			
			PreparedStatement ps5 = connect.prepareStatement("SELECT balance FROM bank WHERE name =?");
		
			ps5.setString(1, send);
			
			ResultSet rs = ps5.executeQuery();
			
			if(rs.next()) {
				if(rs.getInt("balance") < 0) {
					// 잔액없음 -> 이체취소
					System.out.println("잔액이 없으므로 이체 취소");
					connect.rollback();
				}else {
					// 이체성공
					System.out.println("잔액이 있으므로 이체 성공");
					connect.commit();
				}
			}
	
			connect.setAutoCommit(true);
			
		} catch (Exception e) {
					e.printStackTrace();
		}
		

	}

}
