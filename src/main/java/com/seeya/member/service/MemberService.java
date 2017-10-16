package com.seeya.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seeya.member.model.Member;
import com.seeya.member.repository.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	List<Member> members;
	
	public boolean checkedMemberData(String memberid){
		members = memberMapper.selectAll();
		for (Member member : members) {
			if(member.getMemberid().equals(memberid)) {
				System.out.println(member.getMemberid());
				return true;
			}
		}
		return false;
	}
}
