package com.GroundZero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroundZero.Entity.Turf;


@Repository
public interface TurfRepo extends JpaRepository<Turf, Integer>{

}
