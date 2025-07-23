package com.kh.paging.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.paging.dto.pagingDTO;
import com.kh.paging.vo.Film;

@Mapper
public interface FilmMapper {
	List<Film> showFilm(pagingDTO paging);
	int total();

}
