package com.GroundZero.Services;

import java.util.List;

import com.GroundZero.DTO.BookingDTO;
import com.GroundZero.DTO.TurfDTO;
import com.GroundZero.Exception.ResourceNotFoundException;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;


public interface BookingService {
	
	ApiResponse addBooking(@Valid Long playerId, BookingDTO dto) throws ResourceNotFoundException;;
	List<BookingDTO> getBookingOfTurf(@Valid Long turfId);
	ApiResponse confirmTurfBooking(@Valid Long adminId, TurfDTO dto)throws ResourceNotFoundException;;
	ApiResponse cancelBooking(@Valid Long userId, @Valid Long bookingId)throws ResourceNotFoundException;;
	List<BookingDTO> getAll()throws ResourceNotFoundException;
	
}
