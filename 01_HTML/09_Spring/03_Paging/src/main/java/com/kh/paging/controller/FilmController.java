package com.kh.paging.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.kh.paging.service.FilmService;
import com.kh.paging.vo.Film;

@Controller
public class FilmController {
	
	@Autowired
	private FilmService service;
	
	
	@GetMapping("/list")
	public String list(Model model) {
		try {
			List<Film> films = service.showFilm();
			model.addAttribute("list", films);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "list";
	}

	

}
