package com.pj.market.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDAO memberDAO = new MemberDAO();

	public MemberDTO login(MemberDTO memberDTO) throws Exception {
		return memberDAO.login(memberDTO);
	}

	public int join(MemberDTO memberDTO) throws Exception {
		return memberDAO.join(memberDTO);
	}
}
