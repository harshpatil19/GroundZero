package com.GroundZero.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user", uniqueConstraints = 
@UniqueConstraint(columnNames = {"email"})) 
public class User {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	public int userid;
	
	@Column(name="Name", nullable=false, length=50)
	public String username;
	
	@Column(name="Email", nullable=false,unique = true)
	public String email;
	
	@Column(length = 20,name="Password", nullable = false) 
	public String password;
	
	
	@JsonIgnore
	@Column(length = 20,name="Date", nullable = false) 
	public LocalDate dob;
	
	@Column(name = "Phone", length = 14, unique = true)
	public String phone;
	
	@Enumerated(EnumType.STRING) 
	@Column(length = 20,name="Role")
	private Roles role;
	
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
	private Set<Comments> comment=new HashSet<>();
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Turf> post= new ArrayList<>();
	
}
