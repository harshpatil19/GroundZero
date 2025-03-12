package com.GroundZero.Entity;




import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="bookings",
uniqueConstraints = 
@UniqueConstraint(columnNames = {"slot","date","turf_id"}))
public class Booking {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingid; 
	
	@Column(name="No_of_players",nullable=false)
	private Long no_of_players;
	
	@Enumerated(EnumType.STRING)
	@Column(name="slot",nullable=false,length=15)
	private Slot slot;
	
	@Column(name="date",nullable=false)
	private LocalDate date;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status",length=20)
	private Status status;
	
	@OneToOne
	@JoinColumn(name="game_id",nullable=false)
	private Games game;
	
	@OneToOne
	@JsonIgnore
	@JoinColumn(name="turf_id",nullable=false)
	private Turf turf;
	
	@Column(name="confirmation",nullable=false)
	private Boolean confirmation;
}
