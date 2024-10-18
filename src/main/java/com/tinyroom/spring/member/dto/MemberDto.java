package com.tinyroom.spring.member.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class MemberDto extends User{
	private int member_id;
	private String email;
	private String name;
	private String nickname;
	private String profile_img;
	private String description;
	private String blog_title;
	private String blog_img;
	private int theme;
	private int is_active;
	
	public MemberDto(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
	}
}
