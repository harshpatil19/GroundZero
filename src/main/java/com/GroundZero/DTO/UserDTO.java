package com.GroundZero.DTO;

import java.time.LocalDate;

import com.GroundZero.Entity.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDTO {



	public int userid;
	@NotBlank(message = "Name cannot be empty.")
	@Size(min=4,message="Name must be between 3 and 50 characters")
	public String username;
	@Email(message="Invalid email format. Please enter a valid email address")
	public String email;
	@NotBlank(message = "Password cannot be empty.")
	public String password;
	
	public LocalDate dob;
	
	public String phone;
	
	private Roles role;
	
	@JsonIgnore
	public String getPassword(String password) {
		return this.password;
	}
	
	@JsonProperty
	public void setPassword(String password) {
		this.password=password;
	}
}
