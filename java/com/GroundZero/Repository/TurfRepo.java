package com.GroundZero.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroundZero.Entity.Turf;
import com.GroundZero.Entity.User;


@Repository
public interface TurfRepo extends JpaRepository<Turf, Integer>{
	List<Turf>findByUser(User user);
}
