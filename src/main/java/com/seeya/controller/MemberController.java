package com.seeya.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seeya.member.model.Member;

@RestController
public class MemberController {

	@PostMapping("/seeya/profileUpdate")
	public void modifyProfile(@RequestBody Member member) {
		System.out.println("1");
		System.out.println("profile update : "+member);
	}
}
