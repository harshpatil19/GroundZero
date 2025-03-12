package com.GroundZero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroundZero.Entity.User;

@Repository
public interface UserRepo  extends JpaRepository<User, Integer> {

}
