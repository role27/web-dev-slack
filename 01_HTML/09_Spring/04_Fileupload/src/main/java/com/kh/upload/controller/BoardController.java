package com.kh.upload.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BoardController {
	
	@GetMapping("/")
	public String index() {
		return "index";	
	}
	
	public String fileUpload(MultipartFile file) {
		UUID uuid = UUID.randomUUID();
		String fileName = uuid.toString() + "," + file.getOriginalFilename();
		
		File copyFile = new File("\\\\192.168.0.35\\upload\\" +fileName);
		try {
			file.transferTo(copyFile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fileName;
	}

	
	
	@PostMapping("/upload")
	public String upload(MultipartFile file) {
		System.out.println("파일이름 : " + file.getOriginalFilename());
		System.out.println("파일사이즈 : " + file.getSize());
		System.out.println("파일파라미터명 : " + file.getName());
	
		String fileName = fileUpload(file);
		//http://localhost:8081/ + fileName <- url
		return "redirect:/";
		
	}
	
	//List<MultipartFile>
	
	@PostMapping("/multiUpload")
	public String multiUpload(List<MultipartFile> files) {
		
		for(MultipartFile file : files) {
			UUID uuid = UUID.randomUUID();
			String fileName = uuid.toString() + "," + file.getOriginalFilename();
			
		}
		return "redirect:/";
	
	}
	
}
