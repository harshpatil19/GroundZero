package com.GroundZero.Entity;








import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="turf")
public class Turf {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	public int  turfid;
	
	@Column(name="Turf", nullable=false, length=50)
	public String turfname;
	
	private String imageName;
	
	@OneToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	private Address myAddress;
	
	@Column(name="Capacity")
	public int capacity;
	
	@Column(name="Slot")
	public String Slot;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status",length = 20)
	private Status status;
	
	@OneToMany(mappedBy="turf",cascade = CascadeType.ALL)
	private Set<Comments> comment=new HashSet<>();
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "turf_id") 
	private List<Games> games=new ArrayList<>();
	
	@ManyToOne
	private User user;

}
