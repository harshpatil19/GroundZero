package com.GroundZero.DTO;

import java.time.LocalDate;


import com.GroundZero.Entity.Games;
import com.GroundZero.Entity.Slot;
import com.GroundZero.Entity.Status;
import com.GroundZero.Entity.Turf;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookingDTO {
	
	   private int bookingid; 

		private Long no_of_players;
		
		private Slot slot;
		
		@NotNull(message = "Date of Birth required")@FutureOrPresent
		private LocalDate date;
	
		private Status status;
		
		@JsonProperty(access = Access.WRITE_ONLY)
		private Games gameid;
		
		@JsonProperty(access = Access.WRITE_ONLY)
		private Turf turfid;
		
		private Boolean confirmation;
}
