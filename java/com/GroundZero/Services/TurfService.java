package com.GroundZero.Services;

import java.util.List;

import com.GroundZero.DTO.TurfDTO;
import com.GroundZero.DTO.TurfResponse;

public interface TurfService {

	TurfDTO createTurf(TurfDTO turfDto, Integer userid);
	TurfDTO updateTurf(TurfDTO turfDto, Integer turfid);
	void deleteTurf(Integer turfid);
	TurfResponse getAllTurf(int PageNumber, int PageSize, String sortBy);
	
	TurfDTO getTurfById (Integer turfid);
	
	List<TurfDTO>searchTurf(String keyword);
	
	
}
