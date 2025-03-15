package com.GroundZero.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GroundZero.DTO.UserDTO;
import com.GroundZero.Entity.User;
import com.GroundZero.Exception.ResourceNotFoundException;
import com.GroundZero.Repository.UserRepo;
import com.GroundZero.Services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDTO createUser(UserDTO user) {
		User save= userRepo.save(modelMapper.map(user, User.class));
		return modelMapper.map(save,UserDTO.class);
	}

	@Override
	public UserDTO updateUser(UserDTO userDto, Integer userid) {
	User user= userRepo.findById(userid).orElseThrow(()-> new ResourceNotFoundException("User", "Id", userid));
	  user.setUsername(userDto.getUsername());
      user.setEmail(userDto.getEmail());
      user.setPassword(userDto.getPassword());
      user.setDob(userDto.getDob());
      user.setPhone(userDto.getPhone());
      user.setRole(userDto.getRole());
		return modelMapper.map(userRepo.save(user), UserDTO.class);
	}

	@Override
	public UserDTO getUserByid(Integer userid) {
 User user = userRepo.findById(userid).orElseThrow(()-> new ResourceNotFoundException("User","Id",userid));
		return modelMapper.map(user, UserDTO.class);
	}

	@Override
	public UserDTO getUserByEmail(String email) {
		 User user = userRepo.findByEmail(email)
	                .orElseThrow(() -> new ResourceNotFoundException("User", "Email", email));
	        return modelMapper.map(user, UserDTO.class);
	}

	@Override
	public List<UserDTO> getAllUser() {
		  return userRepo.findAll().stream()
	                .map(user -> modelMapper.map(user, UserDTO.class))
	                .collect(Collectors.toList());
	}

	@Override
	public void deleteUser(Integer userid) {
		 User user = userRepo.findById(userid).orElseThrow(() -> new ResourceNotFoundException("User", "Id", userid));
	        userRepo.delete(user);
		
	}
	
	

}
