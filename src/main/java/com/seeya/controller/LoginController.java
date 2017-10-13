package com.seeya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seeya.login.model.Login;
import com.seeya.login.service.LoginService;
import com.seeya.member.model.Member;
import com.seeya.member.repository.MemberMapper;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private MemberMapper memberMapper;

	@PostMapping("seeya/login")
	public Object postMemberLogin(@RequestBody Login login) {
		loginService.checkMemeberLogin(login);
		System.out.println(login);
		Member member = new Member();
		if(login.getError() == null) {
			member = memberMapper.selectByMemberId(login.getMemberid());
			System.out.println("member : " + member);
			return member;
		}
		return login;
	}
	
	
}
