package com.tinyroom.spring.member.domain;

import java.util.List;

import com.tinyroom.spring.post.domain.Post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int member_id;
	private String pw;
	private String email;
	private String name;
	private String nickname;
	private String profile_img;
	private String description;
	private String blog_title;
	private String blog_img;
	private int theme;
	private int is_active; //삭제 계정 판단 여부
}
