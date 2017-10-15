package com.seeya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seeya.member.model.Member;
import com.seeya.member.repository.MemberMapper;

@RestController
public class MemberController {
	
	@Autowired
	MemberMapper memberMapper;

	@PostMapping("seeya/profileUpdate")
	public void modifyProfile(@RequestBody Member member) {
		System.out.println("1");
		System.out.println("profile update : "+member);
	}
	
	@PostMapping("seeya/join")
	public Object joinMember(@RequestBody Member member) {
		System.out.println("1");
		memberMapper.insert(member);
		return memberMapper.selectByMemberId(member.getMemberid());
	}
}
