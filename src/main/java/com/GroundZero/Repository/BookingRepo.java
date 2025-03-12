package com.GroundZero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroundZero.Entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
