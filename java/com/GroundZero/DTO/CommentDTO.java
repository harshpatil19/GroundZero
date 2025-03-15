package com.GroundZero.DTO;

import com.GroundZero.Entity.Turf;
import com.GroundZero.Entity.User;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
	
	private int commentid;
	private String content;
}
