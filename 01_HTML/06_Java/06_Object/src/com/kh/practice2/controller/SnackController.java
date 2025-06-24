package com.kh.practice2.controller;

import com.kh.practice2.model.Snack;

public class SnackController {

	private Snack s = new Snack();

	
	
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장이 완료되었습니다."
		
	}
	
	
<<<<<<< HEAD
	
	
=======
>>>>>>> 2c20a0ea90712d710c0c6381dc2a8062558fabc5
		
	public String confirmData() {
        return s.toString();
	    }
<<<<<<< HEAD
=======
	

>>>>>>> 2c20a0ea90712d710c0c6381dc2a8062558fabc5
		
	}
	
	
	
	
	
	
	
	
	
	

