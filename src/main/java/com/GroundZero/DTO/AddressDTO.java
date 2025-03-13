package com.GroundZero.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
	   private Long id; 

	   @NotBlank(message = "Enter your address.")
		private String addrLine1;
		
	
		private String addrLine2;
		
		@NotBlank(message = "Enter City.")
		private String city;
		

		private String zipCode;
		
		@NotBlank(message = "Enter State.")
		private String state;
		
		@NotBlank(message = "Enter Country.")
		private String country;

}
