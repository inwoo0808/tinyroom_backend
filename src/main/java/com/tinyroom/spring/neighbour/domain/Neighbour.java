package com.tinyroom.spring.neighbour.domain;

import java.util.List;

import com.tinyroom.spring.category.domain.Category;
import com.tinyroom.spring.member.domain.Member;
import com.tinyroom.spring.post.domain.Post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Neighbour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int neighbour_id;
	
	@ManyToOne
	@JoinColumn(name="from_member_id")
	private Member from_member;
	
	@ManyToOne
	@JoinColumn(name="to_member_id")
	private Member to_member;
	
	private int status;
	
}
