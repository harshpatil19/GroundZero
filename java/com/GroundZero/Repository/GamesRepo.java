package com.GroundZero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroundZero.Entity.Games;

@Repository
public interface GamesRepo extends JpaRepository<Games, Integer> {

}
