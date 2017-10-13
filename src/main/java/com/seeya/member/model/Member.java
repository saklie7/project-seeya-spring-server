package com.seeya.member.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private String memberid;
	private String password;
	
	private String lastName;
	private String firstName;
	private String job;
	private String emil;
	private String nickName;
	private String comment;
}
