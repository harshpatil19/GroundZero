package com.GroundZero.Entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="games")
public class Games {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameid; 
	
	@Column(name="game_name",length = 20)
	private String gameName;
	
	@Column(name="description",length=1000)
	private String description;

}
