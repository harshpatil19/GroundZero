package com.GroundZero.Services;

import java.util.List;

import com.GroundZero.DTO.UserDTO;

public interface UserService {

	UserDTO createUser(UserDTO user);
	UserDTO updateUser(UserDTO user, Integer userid );
	UserDTO getUserByid(Integer userid);
	UserDTO getUserByEmail( String email);
	List<UserDTO>getAllUser();	
	void deleteUser (Integer userid);
}
