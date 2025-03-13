package com.GroundZero.DTO;

import com.GroundZero.Entity.Address;
import com.GroundZero.Entity.Status;
import com.GroundZero.Entity.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TurfDTO {

    public int  turfid;

	public String turfname;
	
	private String imageName;

	private Address myAddress;

	public int capacity;

	public String Slot;
	
	private Status status;
	
	private User user;
}
