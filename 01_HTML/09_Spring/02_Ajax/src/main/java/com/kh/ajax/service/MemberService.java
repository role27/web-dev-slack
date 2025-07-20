package com.kh.ajax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ajax.mapper.MemberMapper;
import com.kh.ajax.vo.Member;

<<<<<<< HEAD
@Service
public class MemberService implements MemberMapper {

	@Autowired
	private MemberMapper mapper;
	
=======

@Service
public class MemberService implements MemberMapper{
	
	@Autowired
	private MemberMapper mapper;
	

>>>>>>> cc51683f9aef4c6357ca3ec27c929babad933096
	@Override
	public Member idCheck(String id) {
		return mapper.idCheck(id);
	}

<<<<<<< HEAD
=======

>>>>>>> cc51683f9aef4c6357ca3ec27c929babad933096
	@Override
	public boolean idBoolCheck(String id) {
		return mapper.idBoolCheck(id);
	}
<<<<<<< HEAD

	@Override
	public void register(Member vo) {
		mapper.register(vo);
	}

}
=======
	}


>>>>>>> cc51683f9aef4c6357ca3ec27c929babad933096
