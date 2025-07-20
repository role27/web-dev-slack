package com.kh.ajax.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.ajax.vo.Member;

@Mapper
public interface MemberMapper {
<<<<<<< HEAD
	Member idCheck(String id);
	boolean idBoolCheck(String id);
	void register(Member vo);
}


=======
 Member idCheck(String id);
 boolean idBoolCheck (String id);
}
>>>>>>> cc51683f9aef4c6357ca3ec27c929babad933096
