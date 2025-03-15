package com.GroundZero.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GamesDTO {
	
	    private int gameid; 
		private String gameName;
		private String description;
}
