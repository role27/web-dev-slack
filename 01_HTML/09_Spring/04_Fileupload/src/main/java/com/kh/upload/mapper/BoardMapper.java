package com.kh.upload.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.upload.model.dto.BoardDTO;
import com.kh.upload.model.dto.pagingDTO;
import com.kh.upload.model.vo.Board;


@Mapper
public interface BoardMapper {
	
	void insert(Board vo);
	List<Board> selectAll(pagingDTO paging);
	int total(String keyword);
	Board select(int no);
    void update(BoardDTO dto);
    void delete(int no);
}
