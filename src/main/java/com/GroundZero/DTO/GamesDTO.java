package com.GroundZero.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GamesDTO {
	
	    private Long id; 
		private String game_name;
		private String description;
}
