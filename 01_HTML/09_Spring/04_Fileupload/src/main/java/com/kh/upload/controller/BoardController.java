package com.kh.upload.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.kh.upload.model.dto.BoardDTO;
import com.kh.upload.service.BoardService;
import com.kh.upload.vo.Board;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/")
	public String index() {
		return "index";	
	}
	
	public String fileUpload(MultipartFile file) {
		// 중복방지를 위한 UUID 적용
		UUID uuid = UUID.randomUUID();
		String fileName = uuid.toString() + "_" + file.getOriginalFilename();
		
		File copyFile = new File("\\\\192.168.0.35\\upload\\" +fileName);
		try {
			file.transferTo(copyFile);
		} catch (IllegalStateException | IOException e) {
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
		for (MultipartFile file : files) {
			String fileName = fileUpload(file);
		}

		return "redirect:/";
	
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<BoardDTO> list = service.selectAll();
		model.addAttribute("list", list);
		return "list";
	}
	
	@PostMapping("/write")
	public String write(BoardDTO dto) { //name만 맞춰주면 됨
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
		System.out.println(dto.getFile());
		
		// 이미지 업로드 추가
		String fileName = fileUpload(dto.getFile());
		
		
		// board 테이블에 데이터 추가
		Board vo = new Board();
		vo.setTitle(dto.getTitle());
		vo.setContent(dto.getContent());
		vo.setUrl(fileName);
		service.insert(vo);
		
	    System.out.println(vo);
	    
		return "redirect:/view?no=" + vo.getNo();
	}
	
	// /view?no=${board.no} ->view.jsp
	@GetMapping("/view")
	public String view(int no, Model model) {
		Board board = service.select(no);
		model.addAttribute("board", board);
		return "view";
	}
}
