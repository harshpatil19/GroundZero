package com.GroundZero.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="comments")
public class Comments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int commentid;
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "turf_id")
	private Turf turf;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
