package com.kh.upload.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;


@Mapper
public interface BoardMapper {
	
	List<MultipartFile> files();

}
