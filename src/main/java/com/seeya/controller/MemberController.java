package com.seeya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seeya.member.model.Member;
import com.seeya.member.repository.MemberMapper;
import com.seeya.member.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private MemberService memberService; 
	
	private boolean isMember;
	
	List<Member> members;

	@PostMapping("seeya/profileUpdate")
	public void modifyProfile(@RequestBody Member member) {
		System.out.println("1");
		System.out.println("profile update : "+member);
	}
	
	@PostMapping("seeya/join")
	public Object joinMember(@RequestBody Member member) {
		System.out.println(member);
		isMember = memberService.checkedMemberData(member.getMemberid());
		if(isMember) {
			return "Can not used input ID";
		}
		memberMapper.insert(member);
		return memberMapper.selectByMemberId(member.getMemberid());
	}
	
	
	
}
