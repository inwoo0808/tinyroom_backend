package com.tinyroom.spring.post.domain;


import java.util.Date;

import com.tinyroom.spring.category.domain.Category;
import com.tinyroom.spring.member.domain.Member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int post_id;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	private Date date;
	private String title;
	private String content;
	private String post_img;
	private int is_active; //삭제 여부 판단
}
