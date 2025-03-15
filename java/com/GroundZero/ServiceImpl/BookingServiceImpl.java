package com.GroundZero.ServiceImpl;

import java.util.List;

import com.GroundZero.DTO.BookingDTO;
import com.GroundZero.DTO.TurfDTO;
import com.GroundZero.Exception.ResourceNotFoundException;
import com.GroundZero.Services.BookingService;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

public class BookingServiceImpl implements BookingService {

	@Override
	public ApiResponse addBooking(@Valid Long playerId, BookingDTO dto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDTO> getBookingOfTurf(@Valid Long turfId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse confirmTurfBooking(@Valid Long adminId, TurfDTO dto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse cancelBooking(@Valid Long userId, @Valid Long bookingId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDTO> getAll() throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
