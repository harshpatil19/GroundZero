package com.GroundZero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroundZero.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
